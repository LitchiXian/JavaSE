import java.util.Scanner;
public class Switch01 {
	//编写一个 main 方法
	public static void main(String[] args) {
		//需求
		//请编写一个程序，该程序可以接收一个字符，比如:a,b,c,d,e,f,g
		// a 表示星期一，b 表示星期二 …
		// 根据用户的输入显示相应的信息.要求使用 switch 语句完成
		String weekDay = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符：");
		char day = sc.next().charAt(0);//用户输入的都会变成字符串，所以.charAt(0)
		switch(day){
			case 'a':
				weekDay = "一";
				break;
			case 'b':
				weekDay = "二";
				break;
			case 'c':
				weekDay = "三";
				break;
			case 'd':
				weekDay = "四";
				break;
			case 'e':
				weekDay = "五";
				break;
			case 'f':
				weekDay = "六";
				break;
			case 'g':
				weekDay = "天";
				break;
			default:
				System.out.println("请输入正确字符（a - g）");
				return;
		}
		System.out.println("今天是星期" + weekDay);
	}
}