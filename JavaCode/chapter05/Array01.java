public class Array01{
	public static void main(String[] args){
		//����
		//һ���������� 6 ֻ�������ǵ����طֱ��� 
		//3kg,5kg,1kg,3.4kg,2kg,50kg ����������ֻ�����������Ƕ���?
		//ƽ�������Ƕ���? �����һ������
		//˼·����
		//����6�������洢��������
		//����һ��sum����������������
		//����һ��average����������ƽ������
		//��ӡ���
		//
		//������ͳʵ�ֵķ�ʽ����. 6->600->566
		// �����µļ��� -> ʹ�����������.
		//�ߴ���
		// double chicken1 = 3;
		// double chicken2 = 5;
		// double chicken3 = 1;
		// double chicken4 = 3.4;
		// double chicken5 = 2;
		// double chicken6 = 50;

		// double sum = chicken1 + chicken2 + chicken3
		//  + chicken4 + chicken5 + chicken6;
		// double average = sum / 6;

		// System.out.println("��ֻС����������Ϊ�� " + sum + " kg,ƽ������Ϊ�� " + average + " kg");
		
		//���磬���ǿ����������������һ������
		//
		//����һ������
		//double[] ��ʾ �� double ���͵����飬 ������ chickens
		// {3, 5, 1, 3.4, 2, 50} ��ʾ�����ֵ/Ԫ��,���α�ʾ�����
		// �ڼ���Ԫ��
		double[] chickens = {3, 5, 1, 3.4, 2, 50};
		
		//��������õ����������Ԫ�صĺ�
		//1. ���ǿ���ͨ�� chickens[�±�] �����������Ԫ��
		// �±��Ǵ� 0 ��ʼ��ŵı����һ��Ԫ�ؾ��� chickens[0]
		// �� 2 ��Ԫ�ؾ��� chickens[1] , ��������
		//2. ͨ�� for �Ϳ���ѭ���ķ��� �����Ԫ��/ֵ
		//3. ʹ��һ������ sum ������Ԫ���ۻ�
		double sum = 0, average = 0;
		System.out.println("===ʹ��������===");
		//��ʦ��ʾ�� ����ͨ�� ������.length �õ�����Ĵ�С/����
		//System.out.println("����ĳ���=" + chickens.length);
	
		for( int i = 0; i < chickens.length; i++) {
		//System.out.println("��" + (i+1) + "��Ԫ�ص�ֵ=" + chickens[i]);
		sum += chickens[i];
		}
		System.out.println("������=" + sum
		+ "ƽ������=" + (sum / chickens.length) );
		
		// //ʹ��foreachѭ������������
		// for(double hens : chickens){
		// 	sum += hens;
		// }
		average = sum / chickens.length;
		System.out.println("��ֻС����������Ϊ�� " + sum + " kg,ƽ������Ϊ�� " + average + " kg");

	}
}