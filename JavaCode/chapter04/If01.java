import java.util.Scanner;
public class If01{
	public static void main(String[] args){
		//需求
		//编写一个程序，可以输入人的年龄，如果该同志的年龄大于18岁，
		//则输出"你年龄大于18岁，要对自己的行为负责，送入监狱"
		//思路分析
		//1.定义一个变量int age保存年龄
		//2.接受用户输入年龄nextInt，保存到age
		//3.判断年龄是否大于18岁
		//走代码
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的年龄：");
		age = sc.nextInt();
		if (age > 18) {
			System.out.println("你年龄大于18岁，要对自己的行为负责，送入监狱");
		}
		System.out.println("结束");

	}
}