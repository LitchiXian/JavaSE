public class Homework01{
	public static void main(String[] args){
		//����
		//����max������ʵ����ĳ��double��������ֵ
		double[] arr = {};
		A01 a = new A01();
		System.out.println("arr�������ֵΪ " + a.max(arr));
	}

	
}

class A01{
	public double max(double[] arr){
		//���������ҵ���ٿ��Ǵ��뽡׳��
		if(arr == null || !(arr.length > 0)){
			System.out.println("����������");
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