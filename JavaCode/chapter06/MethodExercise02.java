public class MethodExercise02{
	public static void main(String[] args){
		//需求
		//编写一个方法 copyPerson，可以复制一个 Person 对象，
		//返回复制的对象。克隆对象， 注意要求得到新对象和原
		//来的对象是两个独立的对象，只是他们的属性相同
		Person p1 = new Person();
		p1.name = "Litchi";
		p1.age = 21;
		//思路分析
		//2.实现复制
		Person p2;
		MyTools tools = new MyTools();
		p2 = tools.copyPerson(p1);
		// //3.修改p1属性，打印输出验证
		// p1.age += 1;
		// System.out.println("p1 name=" + p1.name + "; age=" + p1.age);
		// System.out.println("p2 name=" + p2.name + "; age=" + p2.age);
		//3.可以同 对象比较看看是否为同一个对象
		System.out.println(p1 == p2);//false
	}
}

class Person{
	//这里仅用两个为例子
	String name;
	int age;
}

class MyTools{
	//1.定义一个copyPerson方法
	public Person copyPerson(Person p){
		Person copyP = new Person();
		copyP.name = p.name;
		copyP.age = p.age;
		return copyP;
	}
}