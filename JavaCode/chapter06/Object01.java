public class Object01{
	public static void main(String[] args){
		/*
		张老太养了两只猫猫:一只名字叫小白,今年 3 岁,白色。
		还有一只叫小花,今年 100 岁,花色。请编写一个程序，当用户输入小猫的名字时，
		就显示该猫的名字，年龄，颜色。如果用户输入的小猫名错误，
		则显示 张老太没有这只猫猫。
		第 184页
		*/
		
		//单独变量来解决 => 不利于数据的管理(你把一只猫的信息拆解了)
		//第1只猫的信息
		// String cat1Name = "小白";
		// int cat1Age = 3;
		// String car1Color = "白色";

		// //第2只猫的信息
		// String cat1Name = "小花";
		// int cat1Age = 100;
		// String car1Color = "花色";

		// 数组 ===>(1)数据类型体现不出来(2) 只能通过[下标]获取信息，造成变量名字和内容
		// 的对应关系不明确(3) 不能体现猫的行为
		// String[] cat1 = {"小白", "3", "白色"};
		// String[] cat2 = {"小花", "100", "花色"};
		

		//使用 OOP 面向对象解决
		//实例化一只猫
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";

		//实例化一只猫
		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 100;
		cat2.color = "花色";

		System.out.println(cat1.toToString());
		System.out.println(cat2.toToString());
	}
}

//定义一个猫类 Cat -> 自定义的数据类型
class Cat{
	String name;
	int age;
	String color;

	String toToString(){
		return "cat[name=" + name 
				+ ";age=" + age 
				+ ";color=" + color 
				+ "]";
	}
}