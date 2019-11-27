package com.wusi.batis;

import com.wusi.batis.entity.Product;
import com.wusi.batis.mapper.ProductMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class BatisApplicationTests {
    @Autowired
    private ProductMapper productDao;
    @Test
    void contextLoads() {
    }

    @org.junit.Test
    public void  testSelect(){
        List<Product> list=productDao.selectList(null);
        System.out.println(list.size());
    }
}
