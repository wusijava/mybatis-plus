package com.wusi.batis.test;

import com.wusi.batis.entity.Stu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * @ Description   :  测试反射
 * @ Author        :  wusi
 * @ CreateDate    :  2019/12/31$ 15:50$
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class testReflection {
  @Test
    public  void test1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
      /*//正射
      Stu stu=new Stu();
      stu.doWork("数学");
      //反射
      Class clazz=Class.forName("com.wusi.batis.entity.Stu");
      Method method=clazz.getMethod("doWork", String.class);
      Constructor constructor=clazz.getConstructor();
      Object object=constructor.newInstance();
      method.invoke(object, "语文");*/
      /*//1.
      Class clazz1=Class.forName("com.wusi.batis.test.testReflection");
      System.out.println(clazz1);
      //2.
      Class clazz2=testReflection.class;
      System.out.println(clazz2);
      //3.
      testReflection t=new testReflection();
      Class clazz3=t.getClass();
      System.out.println(clazz3);*/

     /* Class clazz=Class.forName("com.wusi.batis.entity.Stu");
      Stu stu1=(Stu) clazz.newInstance();
      System.out.println(stu1);

      Constructor Constructor=clazz.getConstructor();
      Stu stu2=(Stu) Constructor.newInstance();
      System.out.println(stu2);*/
      Class class1 = Class.forName("com.wusi.batis.entity.Stu");
     // Constructor[] constructors = class1.getDeclaredConstructors();
      /*for (int i = 0; i < constructors.length; i++) {
          System.out.println(constructors[i]);
      }*/
     /* Method[] methods = class1.getMethods();
      for (int i = 0; i < methods.length; i++) {
          System.out.println(methods[i]);
      }*/
      BeanUtils.copyProperties("xxx", "yyy");
      Class clazz=Class.forName("com.wusi.batis.entity.Stu");
      Stu stu1=(Stu) clazz.newInstance();
      stu1.setAge(20);
      Stu stu2=new Stu();
      HashMap<String,String> map=new HashMap<>();
     // map.put("a", "b");
      for(Map.Entry<String,String> entry:map.entrySet()){
          String key=entry.getKey();
          String value=entry.getValue();
          System.out.println(key+value);
      }
      if(CollectionUtils.isEmpty(map)){
          System.out.println("collection is null");
      }
      List<String> list=new ArrayList();
      list.add("a");
      Set<String> set =new HashSet(list);
      for (int i = 0; i < set.size(); i++) {
          if(set.contains("a")){
              System.out.println("set contains a");
          }
      }

  }

}
