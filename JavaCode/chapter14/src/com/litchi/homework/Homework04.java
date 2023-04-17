package com.litchi.homework;

/**
 * @author 林志贤
 * @version 1.0
 */
// 查看是否k一样，如果一样，就不添加，调用替换v的方法


//老韩
//(1) HashSet 的去重机制：hashCOde() + equals(), 底层先通过存入对象，进行运算得到一个
// hash 值，通过 hash 值得到对应的索引，如果发现 table 索引所在的位置，没有数据，就直接存放，
// 如果有数据，就进行 equals 比较[遍历比较]，如果比较后，不相同，就加入，否则就不加入.
//(2) TreeSet 的去重机制：如果你传入了一个Comparator 匿名对象，就使用实现的compare 去重，
// 如果方法返回 0，就认为是相同的元素 / 数据，就不添加，如果你没有传入一个Comparator
// 匿名对象，则以你添加的对象实现的Comparable接口的compareTo去重