import  java.util.Scanner;//��ʾ��java.util�µ�Scanner�ർ��
public class Input{
	public static void main(String[] args){
		//��ʾ�����û�������
		//1. �����������ڰ�, java.util.* 
		//2. ��������������������� 
		// myScanner  ���� Scanner ��Ķ���
		Scanner myScanner = new Scanner(System.in);
		//3.  ��������Ĺ���
		System.out.println("����������");
		// ������ִ�е� next ����ʱ����ȴ��û�����~~~
		String name = myScanner.next();//�����û������ַ���
		System.out.println("����������");
		int age = myScanner.nextInt();//�����û�����int
		System.out.println("������нˮ");
		double sal = myScanner.nextDouble();//�����û����� double
		System.out.println("�˵���Ϣ����");
		System.out.println("����\t����\tнˮ\n" + name 
			+ "\t" + age + "\t" + sal);
	}
}