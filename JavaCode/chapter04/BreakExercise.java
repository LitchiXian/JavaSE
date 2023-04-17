import java.util.Scanner;
public class BreakExercise {
	//编写一个 main 方法
	public static void main(String[] args) {
		//需求
		//实现登录验证，有 3 次机会，如果用户名为"丁真" ,密码"666"提示登录成功，
		//否则提示还有几次机会，请使用 for+break完成
		// 思路分析
		// 1. 创建Scanner 对象接收用户输入
		// 2. 定义String name ; String passwd; 保存用户名和密码
		// 3. 最多循环3 次[登录3 次]，如果满足条件就提前退出
		Scanner sc = new Scanner(System.in);
		String userName = "";
		String passWord = "";
		for (int i = 0; i < 3; ++i) {
			System.out.println("请输入用户名：");
			userName = sc.next();
			System.out.println("请输入密码：");
			passWord = sc.next();
			// if (userName.equals("丁真") && passWord.equals("666")) {
			if ("丁真".equals(userName) && "666".equals(passWord)) {//这样子比较好【避免空指针】
				//具体字符串写在前面
				System.out.println("==============================");
				System.out.println("恭喜你，登录成功！！！");
				break;
			}
			System.out.println("登录失败，您还剩 " + (2 - i) + " 次机会");
		}
		System.out.println("欢迎下次光临");
	}
}