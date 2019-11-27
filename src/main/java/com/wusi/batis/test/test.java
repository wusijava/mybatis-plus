package com.wusi.batis.test;

import com.wusi.batis.entity.Product;
import com.wusi.batis.mapper.ProductMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @ Description   :  测试mybatis-plus
 * @ Author        :  wusi
 * @ CreateDate    :  2019/11/26$ 14:41$
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class test {
    @Autowired
    private ProductMapper ProductMapper;
    @Test
    public void  testSelect(){
       List<Product> list=ProductMapper.selectList(null);
     /*   for(Product pro:list){
            System.out.println(pro.getUrl());
        }*/
       Product pro=ProductMapper.selectById(99);
        System.out.println(pro.getState());
    }
}
