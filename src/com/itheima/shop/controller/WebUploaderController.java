package com.itheima.shop.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.alibaba.fastjson.JSONObject;
//文件上传插件接收controller

@RestController
@RequestMapping("/upload")
public class WebUploaderController {
	@RequestMapping(value = "/webUpLoaderPicture")
	public String uploads(@RequestParam("file") MultipartFile[] files, String destDir, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// 文件保存目录路径
		String savePath = request.getSession().getServletContext().getRealPath("/") + "upload\\image"
				+ File.separatorChar + File.separatorChar;

		String saveUrl = request.getContextPath() + File.separatorChar + "upload/image" + File.separatorChar
				+ File.separatorChar;

		// 定义允许上传的文件扩展名
		HashMap<String, String> extMap = new HashMap<String, String>();
		extMap.put("image", "gif,jpg,jpeg,png,bmp");

		// 最大文件大小
		long maxSize = 1000000;
		response.setContentType("text/html; charset=UTF-8");
		String error = "";
		if (!ServletFileUpload.isMultipartContent(request)) {
			error = getError("请选择文件。");
			return error;
		}

		File uploadDir = new File(savePath);
		// 判断文件夹是否存在,如果不存在则创建文件夹
		if (!uploadDir.exists()) {
			uploadDir.mkdirs();
		}

		// 检查目录写权限
		if (!uploadDir.canWrite()) {
			error = getError("上传目录没有写权限。");
			return error;
		}

		String dirName = request.getParameter("dir");
		if (dirName == null) {
			dirName = "image";
		}
		if (!extMap.containsKey(dirName)) {
			error = getError("目录名不正确。");
			return error;
		}

		MultipartHttpServletRequest mRequest = (MultipartHttpServletRequest) request;
		Map<String, MultipartFile> fileMap = mRequest.getFileMap();
		String fileName = null;
		for (Iterator<Map.Entry<String, MultipartFile>> it = fileMap.entrySet().iterator(); it.hasNext();) {
			Map.Entry<String, MultipartFile> entry = it.next();
			MultipartFile mFile = entry.getValue();
			fileName = mFile.getOriginalFilename();
			// 检查文件大小
			if (mFile.getSize() > maxSize) {
				error = getError("上传文件大小超过限制。");
				return error;
			}
			String fileExt = fileName.substring(fileName.lastIndexOf(".") + 1);
			if (!Arrays.<String>asList(extMap.get(dirName).split(",")).contains(fileExt)) {
				error = getError("上传文件扩展名是不允许的扩展名。\n只允许" + extMap.get(dirName) + "格式。");
				return error;
			}
			UUID uuid = UUID.randomUUID();
			String path = savePath + uuid.toString() + "." + fileExt;
			saveUrl = saveUrl + uuid.toString() + "." + fileExt;

			try {
				BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(path));
				FileCopyUtils.copy(mFile.getInputStream(), outputStream);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		JSONObject obj = new JSONObject();
		obj.put("error", 0);
		obj.put("url", saveUrl);
		return obj.toString();
	}

	private String getError(String message) {
		JSONObject obj = new JSONObject();
		obj.put("error", 1);
		obj.put("message", message);
		return obj.toString();
	}

}
