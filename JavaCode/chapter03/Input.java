import  java.util.Scanner;//表示把java.util下的Scanner类导入
public class Input{
	public static void main(String[] args){
		//演示接受用户的输入
		//1. 导入该类的所在包, java.util.* 
		//2. 创建该类对象（声明变量） 
		// myScanner  就是 Scanner 类的对象
		Scanner myScanner = new Scanner(System.in);
		//3.  调用里面的功能
		System.out.println("请输入名字");
		// 当程序执行到 next 方法时，会等待用户输入~~~
		String name = myScanner.next();//接收用户输入字符串
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();//接收用户输入int
		System.out.println("请输入薪水");
		double sal = myScanner.nextDouble();//接受用户输入 double
		System.out.println("人的信息如下");
		System.out.println("姓名\t年龄\t薪水\n" + name 
			+ "\t" + age + "\t" + sal);
	}
}