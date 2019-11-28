package com.wusi.batis.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * @ Description   :  测试BigDecimal
 * @ Author        :  wusi
 * @ CreateDate    :  2019/11/28$ 10:04$
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class testBigDecimal {
    //直接value写数值
    BigDecimal n1=new BigDecimal(0.005);
    BigDecimal n2=new BigDecimal(1000000);
    BigDecimal n3=new BigDecimal(-1000000);
    //字符串初始化
    BigDecimal n4=new BigDecimal("0.005");
    BigDecimal n5=new BigDecimal("1000000");
    BigDecimal n6=new BigDecimal("-1000000");
    //加法
    BigDecimal result1=n1.add(n2);
    BigDecimal result2=n4.add(n5);

    //减法
    BigDecimal result3=n1.subtract(n2);
    BigDecimal result4=n4.subtract(n5);
    //乘法
    BigDecimal result9=n1.multiply(n2);
    BigDecimal result10=n4.multiply(n5);
    //绝对值
    BigDecimal result5=n3.abs();
    BigDecimal result6=n6.abs();
    //除法
    BigDecimal result7=n2.divide(n1,20,BigDecimal.ROUND_HALF_UP);
    BigDecimal result8=n5.divide(n4,20,BigDecimal.ROUND_HALF_UP);
    @Test
     public  void test(){
        System.out.println("加法用value结果："+result1);
        System.out.println("加法用string结果："+result2);

        System.out.println("减法value结果："+result3);
        System.out.println("减法用string结果："+result4);

        System.out.println("乘法用value结果："+result9);
        System.out.println("乘法用string结果："+result10);

        System.out.println("绝对值用value结果："+result5);
        System.out.println("绝对值用string结果："+result6);

        System.out.println("除法用value结果："+result7);
        System.out.println("除法用string结果："+result8);

     }

}
