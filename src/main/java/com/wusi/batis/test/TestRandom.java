package com.wusi.batis.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Random;

/**
 * @ Description   :  测试产生6位验证码
 * @ Author        :  wusi
 * @ CreateDate    :  2019/12/11$ 14:15$
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestRandom {
    @Test
    public void generateAuthcode(){
        StringBuilder sb= new StringBuilder();
        Random random=new Random();
        for (int i = 0; i <6 ; i++) {
            //每次产生一个个位数随机数
            sb.append(random.nextInt(10));
        }
        System.out.println(sb);
    }
}
