package com.yun.product.mapper;

import com.yun.product.model.ProductInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author yun
 * @date 2024/9/25 20:58
 * @desciption: 商品持久层接口
 */
@Mapper
public interface ProductMapper {

    @Select("select *from product_detail where id=#{productId}")
    public ProductInfo selectProductById(Integer productId);

}
