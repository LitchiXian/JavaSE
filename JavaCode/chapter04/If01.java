import java.util.Scanner;
public class If01{
	public static void main(String[] args){
		//����
		//��дһ�����򣬿��������˵����䣬�����ͬ־���������18�꣬
		//�����"���������18�꣬Ҫ���Լ�����Ϊ�����������"
		//˼·����
		//1.����һ������int age��������
		//2.�����û���������nextInt�����浽age
		//3.�ж������Ƿ����18��
		//�ߴ���
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("������������䣺");
		age = sc.nextInt();
		if (age > 18) {
			System.out.println("���������18�꣬Ҫ���Լ�����Ϊ�����������");
		}
		System.out.println("����");

	}
}