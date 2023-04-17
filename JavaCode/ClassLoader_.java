import java.util.*;
import java.lang.reflect.*;
public class ClassLoader_{
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入key");
		String key = sc.next();
		switch(key){
			case "1":
				Dog dog = new Dog();//静态加载，依赖性很强
				dog.cry();
				break;
			case "2":
				//反射 -> 动态加载
				Class cls = Class.forName("Person");//【动态加载】
				Object o = cls.newInstance();
				Method m = cls.getMethod("hi");
				m.invoke(o);
				System.out.println("ok");
				break;
			default:
				System.out.println("do nothing..");
		}
	}
}

//因为new Dog()  是静态加载，因此必须编写 Dog
//Person类 是动态加载，所以，没有编写Person也不会报错，只有当动态加载该类时，才会保存
class Dog {
	public void cry(){
		System.out.println(" dog crying ...");
	}
}


class Person{
	public void hi(){
		System.out.println("people say hi...");
	}
}