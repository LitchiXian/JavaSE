import java.util.Scanner;
public class DoWhileExercise {
	//编写一个 main 方法
	public static void main(String[] args) {
		//需求
		//如果李三不还钱，则老韩将一直使出五连鞭，直到李三说还钱为止
		char key = 'y';
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("还钱不？");
		}while(sc.next().charAt(0) != key);
		System.out.println("Good");
	}
}