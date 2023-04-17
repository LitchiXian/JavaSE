public class HomeWork03{
	public static void main(String[] args){
		//编程，保存两本书，用+拼接，看效果。保存连个性别，
		//用加号拼接，看效果。保存两本书价格，用加号拼接，看效果
		//分析，书名->字符串，性别->字符，书价格->double
		String bookname1 = "龙族";
		String bookname2 = "娱乐至死";
		System.out.println(bookname1 + bookname2);

		char gender1 = '男';
		char gender2 = '女';
		System.out.println(gender1 + gender2);//男 码值 + 女 码值

		double fee1 = 123.45;
		double fee2 = 100.11;
		System.out.println(fee1 + fee2);
	}
}