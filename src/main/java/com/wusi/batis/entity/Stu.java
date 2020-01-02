package com.wusi.batis.entity;

import lombok.Data;

/**
 * @ Description   :  学生实体类
 * @ Author        :  wusi
 * @ CreateDate    :  2019/12/31$ 15:53$
 */
@Data
public class Stu {
    public   String name;
    private Integer age;
    public void doWork(String sub){
        System.out.println("做"+sub+"作业");
    }

    public Stu(String name) {
        this.name = name;
    }

    public Stu(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Stu() {
    }
}
