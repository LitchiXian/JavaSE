public class YangHui{
	public static void main(String[] args){
		//����
		//��ӡ���10��
		//1
		//1 1
		//1 2 1
		//1 3 3 1
		//1 4 6 4 1
		//����
		//˼·����
		//��̬ ��ʼ�� ��ά����
		int len = 10;
		int[][] arr = new int[len][];
		//�������飬���ؿռ�
		for (int i = 0; i < len; ++i) {
			arr[i] = new int[i + 1];
			arr[i][0] = 1;
			//�������鸳ֵ
			for (int j = 1; j < arr[i].length; ++j) {
				if (j == arr[i].length - 1) {
					arr[i][j] = 1;
					continue;
				}
				arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
			}
		}

		//��ӡ���
		for (int[] i : arr) {
			for (int j : i) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}
}