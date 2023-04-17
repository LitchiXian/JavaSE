package com.litchi.houserentdemo.view;

import com.litchi.houserentdemo.domain.House;
import com.litchi.houserentdemo.service.HouseService;
import com.litchi.houserentdemo.utils.Utility;

public class HouseView {
    private boolean loop = true;//控制显示菜单
    private char key = ' ';//显示用户选择
    private HouseService houseService = new HouseService(10);

    //显示主菜单
    public void mainMenu() {
        do {
            System.out.println("========================房屋出租系统菜单=========================");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退      出");
            System.out.println("请输入你的选择(1-6):");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    searchHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exitHouse();
                    break;
                default:
                    System.out.println("请输入正确选项");
            }
        } while (loop);
    }

    //编写listHouse()显示房屋列表
    public void listHouses() {
        System.out.println("--------------------------房屋列表--------------------------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();
        for (House house : houses) {
            if (house == null)
                break;
            System.out.println(house);
        }
        System.out.println("------------------------房屋列表完成-------------------------");
    }

    //编写addHouse() 接收输入，创建House对象，调用add方法
    public void addHouse() {
        System.out.println("--------------------------添加房屋--------------------------");
        System.out.print("姓名: ");
        String name = Utility.readString(8);
        System.out.print("电话: ");
        String phone = Utility.readString(12);
        System.out.print("地址: ");
        String address = Utility.readString(16);
        System.out.print("月租: ");
        int rent = Utility.readInt();
        System.out.print("状态(未出租/已出租): ");
        String state = Utility.readString(3);
        //创建一个新的House对象，注意id 是 系统分配的
        House newHouse = new House(name, phone, address, rent, state);
        if (houseService.add(newHouse)) {
            System.out.println("=================添加房屋成功=================");
        } else {
            System.out.println("=================添加房屋失败=================");
        }
        System.out.println("--------------------------添加完成--------------------------");

    }

    //删除房屋信息
    public void delHouse() {
        //删除房屋
        System.out.println("==================删除房屋==============");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();
        for (House house : houses) {
            if (house == null)
                break;
            System.out.println(house);
        }
        System.out.println("请输入待删除房屋的编号(-1退出):");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("===============放弃删除房屋信息==============");
            return;
        }
        if (houseService.delete(delId)) {
            System.out.println("=================删除房屋成功==================");
        } else
            System.out.println("=================删除房屋失败==================");
    }

    //退出房屋出租系统
    public void exitHouse() {
        System.out.println("是否要退出房屋出租系统:");
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            loop = false;
        }
    }

    //查询房屋信息
    public void searchHouse() {
        System.out.println("--------------------------查找房屋--------------------------");
        System.out.println("请选择您要根据什么查找:");
        System.out.println("1. 编号\n2. 房主\n3. 电话\n4. 地址\n5. 月租\n6. 状态");
        char choice = Utility.readChar();
        switch (choice) {
            case '1':
                searchHouseById();
                break;
            case '2':
                System.out.println(2);
                break;
            case '3':
                System.out.println(3);
                break;
            case '4':
                System.out.println(4);
                break;
            case '5':
                System.out.println(5);
                break;
            case '6':
                System.out.println(6);
                break;
            default:
                System.out.println("请输入正确选项(1-6)");
                System.out.println("--------------------------查找结束--------------------------");
        }
    }

    //通过id查找房屋信息
    public void searchHouseById() {
        System.out.println("请输入你要查找房屋的编号:");
        int searchId = Utility.readInt();
        //TODO 调用方法
        House house = houseService.searchById(searchId);
        if (house == null) {
            System.out.println("请输入正确id");
            return;
        }
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        System.out.println(house);
    }

    //修改房屋信息
    public void updateHouse() {
        System.out.println("------------------------修改房屋信息------------------------");
        System.out.println("请输入待修改房屋的编号(-1表示退出):");
        int id = Utility.readInt();
        if (id == -1) {
            System.out.println("--------------------------退出修改--------------------------");
        }
        House house = houseService.searchById(id);
        if (house == null) {
            System.out.println("请输入正确房屋编号");
            return;
        }

        System.out.println("姓名(" + house.getName() + "):");
        String name = Utility.readString(8, "");
        if (!"".equals(name))
            house.setName(name);

        System.out.println("电话(" + house.getPhone() + "):");
        String phone = Utility.readString(12, "");
        if (!"".equals(phone))
            house.setPhone(phone);

        System.out.println("地址(" + house.getAddress() + "):");
        String address = Utility.readString(16, "");
        if (!"".equals(address))
            house.setAddress(address);

        System.out.println("月租(" + house.getRent() + "):");
        int rent = Utility.readInt(-1);
        if (rent != -1)
            house.setRent(rent);

        System.out.println("状态(" + house.getStatus() + "):");
        String status = Utility.readString(8, "");
        if (!"".equals(status))
            house.setStatus(status);

        System.out.println("--------------------------修改结束--------------------------");

    }
}
