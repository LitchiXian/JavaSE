import java.util.Scanner;
public class If02{
	public static void main(String[] args){
		//����
		//��дһ������,���������˵�����,�����ͬ־��������� 18 ��, 
		//����� "��������� 18,Ҫ���Լ�����Ϊ����, �������"������ ,
		//���"������䲻����ηŹ�����."
		//˼·����
		//1.����һ��Sanner�����û���������
		//2.���û���������䱣�浽����int age
		//3.�ж�
		//�ߴ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������������䣺");
		int age = sc.nextInt();
		if (age > 18) {
			System.out.println("��������� 18,Ҫ���Լ�����Ϊ����, �������");
		}else {
			System.out.println("������䲻����ηŹ�����");
		}
		System.out.println("����");
	}
}