public class VarParameter01{
	public static void main(String[] args){
		LitchiMethod m = new LitchiMethod();
		System.out.println(m.sum());
		System.out.println(m.sum(1, 4, 20));
		int[] arr = {3,6,9,10};
		System.out.println(m.sum(arr));
	}
}

class LitchiMethod{
	//���Լ��� 2 �����ĺͣ�3 �����ĺ� �� 4. 5�� ����
	//����ʹ�÷�������
	// public int sum(int n1, int n2) {//2 �����ĺ�
	// return n1 + n2;
	// }
	// public int sum(int n1, int n2, int n3) {//3 �����ĺ�
	// return n1 + n2 + n3;
	// }
	// public int sum(int n1, int n2, int n3, int n4) {//4 �����ĺ�
	// return n1 + n2 + n3 + n4;
	// }
	//.....
	//1. int... ��ʾ���ܵ��ǿɱ������������ int ,�����Խ��ն�� int(0-��)
	//2. ʹ�ÿɱ����ʱ�����Ե���������ʹ�� �� nums ���Ե�������
	//3. ���� nums ��ͼ���
	public int sum(int... nums) {
		//System.out.println("���յĲ�������=" + nums.length);
		int res = 0;
		for(int i = 0; i < nums.length; i++) {
			res += nums[i];
		}
		return res;
	}
}