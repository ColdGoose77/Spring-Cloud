package com.yun.order.mapper;

import com.yun.order.model.OrderInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author yun
 * @date 2024/9/25 20:33
 * @desciption: 订单数据持久层接口
 */
@Mapper
public interface OrderMapper {

    @Select("select *from order_detail where id=#{orderId}")
    public OrderInfo selectOrderById(Integer orderId);
}
