public class ArithmeticOperatorExercise01{
	public static void main(String[] args){
		int i = 1;
		i = i++;//规则使用临时变量：（1）temp = i;(2) i = i + 1;(3)i = temp;所以是1！！！
		System.out.println(i);//2错了，大意失荆州
	}
}