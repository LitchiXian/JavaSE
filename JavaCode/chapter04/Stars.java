public class Stars {
	//��дһ�� main ����
	public static void main(String[] args) {
		//����
		//���Ľ�����
		int layer = 30;

		for (int i = 1; i <= layer; i++) {//i ��ʾ����
			//�����*֮ǰ��������� ��Ӧ�ո� = �ܲ���-��ǰ��
			for (int j = 1; j <= layer - i; j++) {
				System.out.print(" ");
			}
			//���ƴ�ӡÿ���*����
			for (int j = 1; j <= i * 2 - 1; j++) {
				//��ǰ�еĵ�һ��λ����*,���һ��λ��Ҳ��*, ���һ��ȫ�� *
				if (j == 1 || j == i * 2 - 1 || i == layer) {
					System.out.print("*");
				}else{//�����������ո�
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}