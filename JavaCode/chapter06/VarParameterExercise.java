public class VarParameterExercise{
	public static void main(String[] args){
		//需求
		/*
		有三个方法，分别实现返回姓名和两门课成绩(总分)，
		返回姓名和三门课成绩(总分)，返回姓名和五门课成绩（总分）。
		封装成一个可变参数的方法
		*/
		LitchiMethod t = new LitchiMethod();
		System.out.println(t.sum("Litchi", 30, 12.5, 70));
	}
}

class LitchiMethod{
	public String sum(String name, double... nums){
		double sum = 0;
		for (double i: nums) {
			sum += i;
		}
		return name + " 同学" + nums.length + "门课的总分为：" + sum;
	}
}