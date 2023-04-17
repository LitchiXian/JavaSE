import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args){
		//需求
		String[] arr = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};
		//有一个数列：白眉鹰王、金毛狮王、紫衫龙
		//王、青翼蝠王猜数游戏：从键盘中任意输入一个
		//名称，判断数列中是否包含此名称【顺序查找】
		// 要求: 如果找到了，就提示找到，并给出下标值。
		//思路分析
		//1.定义一个Scanner对象，接受用户输入
		//2.遍历数组，逐个对比
		//3.找到后，输出找到了，并且在输出它是第几个。
		System.out.println("=====arr=====");
		for (String i : arr) {
		System.out.print(i + "\t");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("你要查询的字符串：");
		String search = sc.next();
		for (int i = 0; i < arr.length; ++i) {
			if (search.equals(arr[i])) {
				System.out.println(search + " 是字符串数组的第 " + (i + 1) + " 个");
				System.out.println("谢谢您的使用");
				return;
			}
		}
		System.out.println("sorry");
	}
}