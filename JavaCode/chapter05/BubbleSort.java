public class BubbleSort{
	public static void main(String[] args){
		//����
		//���ǽ��������24,69,80,57,13 ʹ��
		//ð�����򷨽����ų�һ����С������������С�
		int[] arr = {24, 69, 80, 57, 13, 1, 20};
		//˼·����
		//�������飬arr��ǰ����arr���󡿱Ƚ�
		//�������������С�˲�������
		//print
		int temp;
		//���⣬��ֻ��һ��ð�ݣ���Ҫ���ð��
		for (int i = 0; i < arr.length - 1; ++i) {
			for (int j = 0; j < arr.length - 1 - i; ++j) {
				if (arr[j] < arr[j + 1]) {
					continue;
				}
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
		

		System.out.println("=====arr=====");
		for (int i : arr) {
			System.out.print(i + "\t");
		}
	}
}