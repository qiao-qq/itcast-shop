package com.itheima.shop.pojo;

import java.util.Date;

public class AdContent {
    private Long id;

    private String name;

    private String title;

    private Long categoryid1;

    private Long categoryid2;

    private Long categoryid3;

    private String categoryname3;

    private Integer sort;

    private String img;

    private String imgSize;

    private String url;

    private Date createTime;

    private Date updateTime;

    private String status;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Long getCategoryid1() {
        return categoryid1;
    }

    public void setCategoryid1(Long categoryid1) {
        this.categoryid1 = categoryid1;
    }

    public Long getCategoryid2() {
        return categoryid2;
    }

    public void setCategoryid2(Long categoryid2) {
        this.categoryid2 = categoryid2;
    }

    public Long getCategoryid3() {
        return categoryid3;
    }

    public void setCategoryid3(Long categoryid3) {
        this.categoryid3 = categoryid3;
    }

    public String getCategoryname3() {
        return categoryname3;
    }

    public void setCategoryname3(String categoryname3) {
        this.categoryname3 = categoryname3 == null ? null : categoryname3.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getImgSize() {
        return imgSize;
    }

    public void setImgSize(String imgSize) {
        this.imgSize = imgSize == null ? null : imgSize.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}