public class TernaryOperatorDetail{
	public static void main(String[] args){
		//��������Ԫ�������ʵ���ҳ����������ֵ
		//˼·����
		//��������int ���� a ,b ,c ;Ҫ�������ζԱ�
		//�� a �� b �Ƚϣ�˭��˭�� c �Ƚ�
		
		int a = 5;
		int b = 9;
		int c = 11;
		// 1.������Ԫ�����
		int max1 = a > b ? a : b;
		int max2 = first > c ? first : c;
		System.out.println("���ֵΪ " + max2);
		//2.һ����Ԫ�����
		// int max = a > b ? a > c ? a : c : b > c ? b : c;
		// System.out.println("���ֵΪ " + max2);
		// �Ϻ��Ż�1���� max1 = a > b ? a : b;������ֱ�Ӱ�first�滻
		// int max2 = (a > b ? a : b) > c ? (a > b ? a : b) : c;
		// System.out.println("���ֵΪ " + max2);
		// 
		// �����Ƽ�1���Ƚ�����
	}
}