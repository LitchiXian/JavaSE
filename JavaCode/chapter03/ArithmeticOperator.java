public class ArithmeticOperator{
	public static void main(String[] args){
		// *���ˣ�  /������ ��ʱ��ע����ʲô���ͣ�int ���� double
		System.out.println(10 / 4);//����ѧ�Ƕ���2.5�������������߶��������ͣ�����=2
		System.out.println(10 / 4.0);//2.5

		double d = 10 / 4;
		System.out.println(d);//Ҳ��һ���ģ��ұߵ����㶼�����ͣ���ע������ֵ��double������=2.0

		//  % (ȡģ��ȡ��)
		System.out.println(10 % 3);//1
		System.out.println(-10 % 3);//2//���ˣ���-1
		System.out.println(10 % -3);//2//���ˣ���1
		System.out.println(-10 % -3);//2//���ˣ���-1
		//�� % �ı��� ����һ����ʽ a % b = a - a / b * b
		//-10 % 3 = -10 - (-10) / 3 * 3 = -10 + 9 = -1
		//10 % -3 = 10 - 10 / (-3) * (-3) = 10 - 9 = 1
		//-10 % -3 = -10 - (-10) / (-3) * (-3) = -10 + 9 = -1
		
		int j1 = 8;
		int j2 = 8;
		int k1 = ++j1;//�ȼ� j1 = j1 + 1; k1 = j1;
		int k2 = j2++;//�ȼ� k2 = j2; j2 = j2 + 1;

		System.out.println(j1);//9
		System.out.println(j2);//9
		System.out.println(k1);//9
		System.out.println(k2);//8
	}
}