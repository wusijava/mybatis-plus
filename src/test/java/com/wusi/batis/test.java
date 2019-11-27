package com.wusi.batis;

import com.wusi.batis.entity.Product;
import com.wusi.batis.mapper.ProductMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ Description   :  测试mybatis-plus
 * @ Author        :  wusi
 * @ CreateDate    :  2019/11/26$ 14:41$
 */
public class test {
    @Autowired
    private ProductMapper productDao;
    @Test
    public void  testSelect(){
        List<Product> list=productDao.selectList(null);
        System.out.println(list.size());
    }
}
