public class VarParameterExercise{
	public static void main(String[] args){
		//����
		/*
		�������������ֱ�ʵ�ַ������������ſγɼ�(�ܷ�)��
		�������������ſγɼ�(�ܷ�)���������������ſγɼ����ܷ֣���
		��װ��һ���ɱ�����ķ���
		*/
		LitchiMethod t = new LitchiMethod();
		System.out.println(t.sum("Litchi", 30, 12.5, 70));
	}
}

class LitchiMethod{
	public String sum(String name, double... nums){
		double sum = 0;
		for (double i: nums) {
			sum += i;
		}
		return name + " ͬѧ" + nums.length + "�ſε��ܷ�Ϊ��" + sum;
	}
}