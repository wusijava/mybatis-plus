package com.wusi.batis.test;

import com.wusi.batis.mapper.ProductMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

/**
 * @ Description   :  测试java8新特性
 * @ Author        :  mr.wu
 * @ CreateDate    :  2019/11/26$ 14:41$
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class java8Test {
    @Autowired
    private ProductMapper ProductMapper;
    @Test
    public void  testSelect() {
        Integer[] numArray={1,2,3,4,5,6};
        List<Integer> numList= Arrays.asList(numArray);
        //lambda表达式遍历
        numList.forEach((num)->System.out.println(num) );
    }
    @Test
    public void  test2() {
       new Thread(new Runnable() {
           @Override
           public void run() {
               System.out.println("Test");
           }
       }).start();
       //使用lambda来创建线程
        new Thread(()->System.out.println("测试")).start();
    }

}
