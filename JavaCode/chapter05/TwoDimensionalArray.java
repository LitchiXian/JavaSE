public class TwoDimensionalArray{
	public static void main(String[] args){
		//����
		//��̬ ���������λ���飬�����
		//{{1}��{2��2}��{3��3��3}}
		//˼·����
		//1.Ҫ��̬�����Զ���ʱ��ֻ˵������������˵��Ԫ�ظ���
		int len = 10;
		int[][] arr = new int[len][];
		//2.�������飬�����ݿ��ؿռ�
		for (int i = 0; i < len; ++i) {
			arr[i] = new int[i + 1];
			//3.�������鸳ֵ
			for (int j = 0; j < arr[i].length; ++j) {
				arr[i][j] = i + 1;
			}	
		}
		//4.��ӡ���
		for (int[] i : arr) {
			for (int j : i) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}
}