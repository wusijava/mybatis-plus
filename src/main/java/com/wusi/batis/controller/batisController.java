package com.wusi.batis.controller;

import com.wusi.batis.entity.Product;
import com.wusi.batis.mapper.ProductMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ Description   :  java类作用描述
 * @ Author        :  wusi
 * @ CreateDate    :  2019/11/26$ 16:06$
 */
@RestController

public class batisController {
    @Autowired
    private ProductMapper productMapper;
    @RequestMapping("list")
    @ApiOperation(value = "测试Swagger")
    public  void test(){
        List<Product> list= productMapper.selectList(null);
       for (Product pro:list){

           System.out.println(pro.getUrl());
       }
    }
}
