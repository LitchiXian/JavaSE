public class ForExercise {
	//��дһ�� main ����
	public static void main(String[] args) {
		//����
		//��ӡ 1~100 ֮�������� 9 �ı�����������ͳ�Ƹ��� �� �ܺ�.
		//[����Ϊ��,�������]
		//����Ϊ�򣺼������ӵ����󣬲��ɼ򵥵���������� ��� = ˼�� --��ϰ-> ����
		//������� : �ȿ��ǹ̶���ֵ��Ȼ��ת�ɿ������仯��ֵ
		//˼·����
		//1.forѭ����ӡ 1~100 ֮�������� 9 �ı���������
		//2.����һ������ ͳ�Ƹ��� int number��һ�����������ܺ�int sum
		//3.��ӡ���
		//�ߴ���
		
		//�������(����Ǻ���д��)
		int divisor = 9;
		int start = 10, end = 200;
		//����Ϊ��
		int number = 0, sum = 0;
		for (int i = start; i <= end; ++i) {
			if (i % divisor == 0) {
				System.out.print(i + "\t");
				++number;
				sum += i;
			}
		}
		System.out.println();
		System.out.println(start + " ~ " + end + " ֮�� �ܹ��� " + number + " �� " + divisor + " �ı��������������ǵ��ܺ�Ϊ " + sum);
		
		// 
		// int number = 10;
		// for (int i = 0; i <= number; ++i) {
		// 	System.out.println(i + " + " + (number - i) + " = " + number);
		// }
		// System.out.println("���������");
	}
}