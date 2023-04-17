import java.util.Scanner;
public class SwitchExercise {
	//编写一个 main 方法
	public static void main(String[] args) {
		//根据用于指定月份，
		//打印该月份所属的季节。
		////思路分析
		//1. 创建 Scanner 对象， 接收用户输入
		//2. 使用 int moon 接收
		//3. 使用 switch 来匹配 ,使用穿透来完成，比较简洁
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入现在的月份：");
		int moon = sc.nextInt();
		switch(moon){
			case 1:
			case 2:
			case 3:
				System.out.println("现在是春天，很凉爽");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("现在是夏天，很热");
				break;
			case 7:
			case 8:
			case 9:
				System.out.println("现在是秋天，很凉爽");
				break;
			case 10:
			case 11:
			case 12:
				System.out.println("现在是冬天，超级凉爽");
				break;
			default:
				System.out.println("请输入正确的月份");
		}
		System.out.println("日子一天一天过着~~~");
	}
}