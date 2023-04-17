package com.litchi.houserentdemo.service;

import com.litchi.houserentdemo.domain.House;
import com.litchi.houserentdemo.utils.Utility;

public class HouseService {
    private House[] houses;//保存House对象
    private int houseNums = 1;//记录当前有多少个房屋信息
    private int id = 1;

    public HouseService(int size) {
        //new houses
        houses = new House[size];//当创建HouseService对象，指定数组大小
        //为了配合测试列表信息，这里初始化一个House对象
        houses[0] = new House(houseNums, "jack", "112", "集美区", 2000, "未出租");
    }

    //list方法，返回houses
    public House[] list() {
        return houses;
    }

    //add方法，添加新对象，返回boolean
    public boolean add(House newHouse) {
        //判断是否还可以继续添加(我们暂时不考虑数组扩容的问题)
        if (houseNums == houses.length) {
            System.out.println("数组已满，不能再添加了...");
            return false;
        }
        //把newHouse对象加入到，新增一个房屋
        houses[houseNums++] = newHouse;
        newHouse.setId(++id);
        return true;
    }

    //删除房屋
    public boolean delete(int id) {
        //应当先找到要删除的房屋信息对应的下标
        //一定要搞清楚 下标和房屋编号不是一回事
        int index = -1;
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getId() == id) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("请输入正确编号");
            return false;
        }
        char key = Utility.readConfirmSelection();//该方法本身就含有循环判断y/n
        if (key == 'n') {
            return false;
        }

        if (index == 9)
            return true;
        for (int i = index; i < houses.length - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--houseNums] = null;
        return true;
    }

    //通过id查询房屋
    public House searchById(int searchId) {

        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getId() == searchId) {
                return houses[i];
            }
        }
        return null;

    }

}
