public class ArrayExercise02{
	public static void main(String[] args){
		//����
		//�����һ������ int[]�����ֵ {4,-1,9, 10,23}��
		//���õ���Ӧ���±ꡣ
		//˼·����
		//1.���õ�һ��Ϊ���ֵ��max��index
		//2.�������飬����Ƚ�
		//3.��������ľͻ�maxֵ��indexֵ
		//4.��ӡ���
		int[] arr = {411,-1,911, 10,23};
		int max = arr[0],index = 0;
		for (int i = 1; i < arr.length; ++i) {
			if (arr[i] < max) {
				continue;
			}
			max = arr[i];
			index = i;
		}
		System.out.println("���������ֵΪ��" + max + " , ���±�Ϊ��" + index);
	}
}