package com.itheima.shop.mapper;

import com.itheima.shop.pojo.OrderSku;
import com.itheima.shop.pojo.OrderSkuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderSkuMapper {
    int countByExample(OrderSkuExample example);

    int deleteByExample(OrderSkuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderSku record);

    int insertSelective(OrderSku record);

    List<OrderSku> selectByExample(OrderSkuExample example);

    OrderSku selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderSku record, @Param("example") OrderSkuExample example);

    int updateByExample(@Param("record") OrderSku record, @Param("example") OrderSkuExample example);

    int updateByPrimaryKeySelective(OrderSku record);

    int updateByPrimaryKey(OrderSku record);
}