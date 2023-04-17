package com.litchi.everyday;

import java.util.*;

/**
 * @author 林志贤
 * @version 1.0
 */
@SuppressWarnings("all")
public class Map_ {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        /*
        //确定扩容因子
            public HashMap() {
                this.loadFactor = DEFAULT_LOAD_FACTOR; // all other fields defaulted
            }

            static final float DEFAULT_LOAD_FACTOR = 0.75f;
         */
        hashMap.put(1, "Hello");
        /*
        1.
            public V put(K key, V value) {
                return putVal(hash(key), key, value, false, true);
            }
            //每一个元素会以自己的算法判断它的 hash 值
            static final int hash(Object key) {
                int h;
                return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
            }
        2.前方高能，非战斗人员，请迅速撤离
            final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
                Node<K,V>[] tab; Node<K,V> p; int n, i;//辅助变量
                //如果底层的table 数组为 null ，或者 length = 0， 就扩容到 16
                if ((tab = table) == null || (n = tab.length) == 0)
                    n = (tab = resize()).length;
                //取出 hash值对应的 table的索引位置的 Node，如果为null， 就直接把加入的 k-v
                // 创建成一个 Node，加入该位置即可
                if ((p = tab[i = (n - 1) & hash]) == null)
                    tab[i] = newNode(hash, key, value, null);
                else {
                    Node<K,V> e; K k;
                    //如果table的索引位置的 key的hash 和新的 key 的 hash 相同，并且满足（equals）相同
                    //就认为不能加入新的 k-v
                    if (p.hash == hash &&
                        ((k = p.key) == key || (key != null && key.equals(k))))
                        e = p;
                    //如果当前的table 已有的 Node 是红黑树，就按照红黑树的逻辑来处理
                    else if (p instanceof TreeNode)
                        e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                    else {
                        //如果找到的结点，后米是链表，就循环比较
                        for (int binCount = 0; ; ++binCount) {//死循环
                            if ((e = p.next) == null) {//如果整个链表，没有和他相同，就加到该链表的最后
                                p.next = newNode(hash, key, value, null);
                                //加入后，判断当前链表的个数，是否已经到达8个，到8个后
                                //就调用 treeifyBin 方法进行红黑树 的转换
                                if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                    treeifyBin(tab, hash);
                                break;
                            }
                            //如果在循环比较过程中，发现有相同，就break，就只是替换 v
                            if (e.hash == hash &&
                                ((k = e.key) == key || (key != null && key.equals(k))))
                                break;
                            p = e;
                        }
                    }
                    if (e != null) { // existing mapping for key
                        V oldValue = e.value;
                        if (!onlyIfAbsent || oldValue == null)
                            e.value = value;
                        afterNodeAccess(e);
                        return oldValue;
                    }
                }
                ++modCount;//每增加一个Node ，就size++
                if (++size > threshold)//如果size > 临界值，就扩容
                    resize();
                afterNodeInsertion(evict);
                return null;
            }
         */
        hashMap.replace(1, "World");

        Hashtable hashtable = new Hashtable();
        /*
        //简单说明一下 HashTable 的底层
        //1.底层的数组 HashTable$Entry[] 初始化大小为 11
        //2.临界值 threshold 8 = 11 * 0.75
        //3.扩容：按照自己的扩容机制来进行扩容
        //4.执行 方法 addEntry(hash, key, value, index);添加K-V 封装到Entry
        //5.当 if (count >= threshold) 满足时，就进行扩容
        //  按照 int newCapacity = (oldCapacity << 1) + 1; 的大小扩容
         */
        hashtable.put(1, "Hello");
        hashtable.put(2, "World");

        TreeMap<Integer, String> integerStringTreeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        integerStringTreeMap.put(1, "Hello");
        integerStringTreeMap.put(2, "World");

        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(1, "Hello");
        linkedHashMap.put(2, "World");
    }
}
