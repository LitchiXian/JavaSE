public class FloatDetail{
	public static void main(String[] args){
		
		//Java�ĸ����ͳ���������ֵ��Ĭ��Ϊdouble�ͣ�����float�ͳ��������ں���� ' f ' �� ' F '
		//float num1 = 1.1;//�Բ��ԣ�����8�ֽ����ݷŲ���4�ֽڿռ�
		float num2 = 1.1F;//��
		double num3 = 1.1;//��
		double num4 = 1.1f;//���Ե�
		//ͨ������£�Ӧ��ʹ��double�ͣ���Ϊ����float�͸���ȷ
		double num5 = 2.1234567821;
		float num6 = 2.1234567821f;
		// System.out.println(num5);
		// System.out.println(num6);

		// ������ʹ�����壺2.7 �� 8.1 / 3 �Ƚ�
		double num7 = 2.7;
		double num8 = 8.1/3;//2.7
		System.out.println(num7);//����2.7
		System.out.println(num8);//�ӽ�2.7��ֵ
		//�õ�һ����Ҫ��ʹ�õ㣺�����Ƕ���������С���Ľ�������ж�ʱ��ҪС��
		//Ӧ�������������Ĳ�ֵ�ľ���ֵ����ĳ�����ȷ�Χ���ж�
		// if( num7 == num8){
		// 	System.out.println("���");
		// }
		System.out.println(Math.abs(num7 - num8));
		if (Math.abs(num7 - num8) < 0.000000001) {
			System.out.println("��ֵ�ǳ�С�����ҵĹ涨���ȣ���Ϊ���");
		}
	}
}