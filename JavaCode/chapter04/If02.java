import java.util.Scanner;
public class If02{
	public static void main(String[] args){
		//需求
		//编写一个程序,可以输入人的年龄,如果该同志的年龄大于 18 岁, 
		//则输出 "你年龄大于 18,要对自己的行为负责, 送入监狱"。否则 ,
		//输出"你的年龄不大这次放过你了."
		//思路分析
		//1.定义一个Sanner接受用户输入数据
		//2.将用户输入的年龄保存到变量int age
		//3.判断
		//走代码
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的年龄：");
		int age = sc.nextInt();
		if (age > 18) {
			System.out.println("你年龄大于 18,要对自己的行为负责, 送入监狱");
		}else {
			System.out.println("你的年龄不大这次放过你了");
		}
		System.out.println("结束");
	}
}