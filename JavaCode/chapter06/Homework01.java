public class Homework01{
	public static void main(String[] args){
		//需求
		//定义max方法，实现求某个double数组的最大值
		double[] arr = {};
		A01 a = new A01();
		System.out.println("arr数组最大值为 " + a.max(arr));
	}

	
}

class A01{
	public double max(double[] arr){
		//先完成正常业务，再考虑代码健壮性
		if(arr == null || !(arr.length > 0)){
			System.out.println("请输入数字");
			return -1;
		}
		double max = -1;
		for (double i: arr) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
}