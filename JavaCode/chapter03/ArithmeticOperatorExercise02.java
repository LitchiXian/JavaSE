public class ArithmeticOperatorExercise02{
	public static void main(String[] args){
		//1.需求
		//假如还有 59 天放假，问：合 xx 个星期零 xx 天
		//2.思路分析
		//（1） 使用int 变量 days 保存 天数
		//（2） 一个星期是7天 星期数weeks：days / 7 零xx天leftDays : days % 7
		//（3）	输出
		//3.走代码
		int days = 12344;
		int weeks = days / 7;
		int leftDays = days % 7;
		System.out.println(days + "天 合" + weeks + "星期零" 
		+ leftDays + "天");

		//1.需求
		//定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为
		//：5/9*(华氏温度-100),请求出华氏温度对应的摄氏温度
		//2.思路分析
		//（1）定义一个double变量huaShi保存华氏温度，一个double变量sheShi保存摄氏温度
		//（2）sheShi = 5 / 9 * (huaShi - 100)
		//		考虑数学公式和 java 语言的特性
		//（3）打印输出
		//3.走代码
		double huaShi = 26;
		double sheShi;
		sheShi = 5.0 / 9 * (huaShi - 100);
		System.out.println(huaShi + "华氏温度对应的摄氏温度为" + sheShi);

	}
}