package com.litchi.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 林志贤
 * @version 1.0
 */
@SuppressWarnings("all")
public class SetMethod {
    public static void main(String[] args) {
        //解读
        //1. 以 Set 接口的实现类 HashSet 来讲解 Set 接口的方法
        //2. set 接口的实现类的对象(Set 接口对象), 不能存放重复的元素, 可以添加一个 null
        //3. set 接口对象存放数据是无序(即添加的顺序和取出的顺序不一致)
        //4. 注意：取出的顺序的顺序虽然不是添加的顺序，但是他的固定.
        Set set = new HashSet();
        set.add("john");
        set.add("lucy");
        set.add("john");//重复
        set.add("jack");
        set.add("hsp");
        set.add("mary");
        set.add(null);//
        set.add(null);//再次添加 null
        //4. 注意：取出的顺序的顺序虽然不是添加的顺序，但是他的固定.
        for (int i = 0; i < 10; i++) {
            System.out.println("set=" + set);
        }

        //遍历
        //1.使用迭代器
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }

        set.remove(null);

        //2.使用增强for
        for (Object o : set) {
            System.out.println("o=" + o);
        }

        //set 接口不能通过普通索引获取

    }
}
