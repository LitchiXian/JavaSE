public class WhileExercise {
	//编写一个 main 方法
	public static void main(String[] args) {

		//需求
		// 打印 1—100 之间所有能被 3 整除的数 [使用 while, 老师评讲 ]
		int start = 1, end = 1000;
		int number = 400;
		while(start <= end){
			if (start % number == 0) {
				System.out.println(start);
			}
			++start;
		}

		//需求
		// 打印 40—200 之间所有的偶数 [使用 while, 课后练习]
		// int i = 40;
		// while(i <= 200){
		// 	if (i % 2 == 0) {
		// 		System.out.println(i);
		// 	}
		// 	++i;
		// }
	}
}