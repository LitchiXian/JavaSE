package com.litchi.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Map_ {
    public static void main(String[] args) {
        //解读Map 接口实现类的特点
        //1.Map 与 Collection 并列存在。用于保存具有映射关系的数据:Key-Value(双列元素)
        //2.Map 中的 key 和 value 可以是任何引用类型的数据，会封装到 HashMap$Node 对象中
        //3.Map 中的 key 不允许重复，原因和 HashSet 一样，前面分析过源码.
        //4.Map 中的 value 可以重复
        //5.Map 的 key 可以为 null, value 也可以为 null，注意 key 为 null, 只能有一个,value 为 null ,可以多个.
        //6.常用 String 类作为 Map 的 key
        //7.key 和 value之间存在单向一对一关系，即通过指定的 key 总能找到对应的 value
        Map map = new HashMap();
        map.put("no1", "litchi");//k-v
        map.put("no2", "jack");//k-v
        System.out.println("map=" + map);

        map.put("no1", "saltyLitchi");//当有相同的k，就等价于替换v
        map.put("no3", "jack");//k-v
        System.out.println("map=" + map);

        map.put(null, null);//k-v
        map.put(null, null);//替换v
        map.put("no4", null);//k-v
        map.put("no5", null);//k-v
        System.out.println("map=" + map);

        //通过 get 方法，出入kev，会返回对应的 value
        System.out.println(map.get("no3"));
    }
}
