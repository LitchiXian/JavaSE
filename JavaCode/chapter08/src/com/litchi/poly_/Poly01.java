package com.litchi.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master litchi = new Master("litchi");
        Dog dog = new Dog("波奇塔");
        Bone bone = new Bone("大酱骨");
        litchi.feed(dog, bone);

        Cat cat = new Cat("小花");
        Fish fish = new Fish("沙丁鱼");
        litchi.feed(cat, fish);
    }
}

class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //使用多态机制，可以统一的管理主人喂食的问题
    //animal 编译类型是Animal，可以指向(接收) Animal子类的对象
    public void feed(Animal animal, Food food) {
        System.out.println("主人 " + name + " 给 " + animal.getName() + " 喂 " + food.getName() + " 食物");
    }

//    //主人给小狗 喂食 骨头
//    public void feed(Dog dog, Bone bone) {
//        System.out.println("主人 " + name + " 给 " + dog.getName() + " 喂 " + bone.getName() + " 食物");
//    }
//
//    //主人给小猫 喂食 黄花鱼
//    public void feed(Cat cat, Fish fish) {
//        System.out.println("主人 " + name + " 给 " + cat.getName() + " 喂 " + fish.getName() + " 食物");
//    }
    //主人给小猪 喂食 ……
    //主人给小鱼 喂食 ……
    //主人给………………
    //本质 主人给 Animal 喂 Food
    //引出我们要讲解的多态

}