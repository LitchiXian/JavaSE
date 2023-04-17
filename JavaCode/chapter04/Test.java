public class Test {
	//编写一个 main 方法
	public static void main(String[] args) {
		//需求
		//随机生成 1-100 的一个数，直到生成了 97 这个数，看看你一共用了几次?
		//提示使用 (int)(Math.random() * 100) + 1
		//思路分析：
		//循环，但是循环的次数不知道. -> break ,当某个条件满足时，终止循环
		//通过该需求可以说明其它流程控制的必要性，比如 break
		// while(true){
		// 	int number = (int)(Math.random() * 100) + 1;
		// 	System.out.println(number);
		// 	if (number == 97) {
		// 		break;
		// 	}
		// }
		// 
		// 
		// 
		int count = 0;
		for (int i = 1;i <= 100 ; ++i) {
			if (i%5 == 0) {
				continue;
			}
			System.out.print(i + "\t");
			count++;
			if (count == 5) {
				count = 0;
				System.out.println();
			}
		}
	}
}