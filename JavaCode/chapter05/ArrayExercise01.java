public class ArrayExercise01{
	public static void main(String[] args){
		//����
		//����һ�� char ���͵� 26 ��Ԫ�ص����飬�ֱ� ����'A'-'Z'��
		//ʹ�� for ѭ����������Ԫ�ز���ӡ��������ʾ��char ����
		// �������� 'A'+1 -> 'B'
		// ˼·����
		// 1.����һ������ char[] letter
		// 2.forѭ��ʵ������Ԫ�صĴ洢
		// 3.for ѭ����������
		
		char[] letters = new char[26];
		// letters[0] = 'A';
		// for (int i = 1; i < letters.length; i++) {
		// 	letters[i] = (char)(letters[i - 1] + 1);
		// }
		for (int i = 0; i < letters.length; i++) {
			letters[i] = (char)('A' + i);
		}
		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i] + "\t");
		}
	}
}