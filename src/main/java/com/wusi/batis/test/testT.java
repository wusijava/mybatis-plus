package com.wusi.batis.test;


import java.util.ArrayList;
import java.util.List;

/**
 * @ Description   :  测试泛型
 * @ Author        :  wusi
 * @ CreateDate    :  2019/12/7$ 12:00$
 */
public class testT {
    public <T> T get1(T t){
        if(t instanceof  String){
            System.out.println("I am String");
        }else if(t instanceof Integer) {
            System.out.println("I am Integer");
        }
        return t;
    }
    public static void main(String[] args) {
        //String a="a";
        List<String> a= new ArrayList<>();

    }
}
