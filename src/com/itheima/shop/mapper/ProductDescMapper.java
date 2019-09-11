package com.itheima.shop.mapper;

import com.itheima.shop.pojo.ProductDesc;
import com.itheima.shop.pojo.ProductDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductDescMapper {
    int countByExample(ProductDescExample example);

    int deleteByExample(ProductDescExample example);

    int deleteByPrimaryKey(Long productId);

    int insert(ProductDesc record);

    int insertSelective(ProductDesc record);

    List<ProductDesc> selectByExample(ProductDescExample example);

    ProductDesc selectByPrimaryKey(Long productId);

    int updateByExampleSelective(@Param("record") ProductDesc record, @Param("example") ProductDescExample example);

    int updateByExample(@Param("record") ProductDesc record, @Param("example") ProductDescExample example);

    int updateByPrimaryKeySelective(ProductDesc record);

    int updateByPrimaryKey(ProductDesc record);
}