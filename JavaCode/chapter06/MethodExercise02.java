public class MethodExercise02{
	public static void main(String[] args){
		//����
		//��дһ������ copyPerson�����Ը���һ�� Person ����
		//���ظ��ƵĶ��󡣿�¡���� ע��Ҫ��õ��¶����ԭ
		//���Ķ��������������Ķ���ֻ�����ǵ�������ͬ
		Person p1 = new Person();
		p1.name = "Litchi";
		p1.age = 21;
		//˼·����
		//2.ʵ�ָ���
		Person p2;
		MyTools tools = new MyTools();
		p2 = tools.copyPerson(p1);
		// //3.�޸�p1���ԣ���ӡ�����֤
		// p1.age += 1;
		// System.out.println("p1 name=" + p1.name + "; age=" + p1.age);
		// System.out.println("p2 name=" + p2.name + "; age=" + p2.age);
		//3.����ͬ ����ȽϿ����Ƿ�Ϊͬһ������
		System.out.println(p1 == p2);//false
	}
}

class Person{
	//�����������Ϊ����
	String name;
	int age;
}

class MyTools{
	//1.����һ��copyPerson����
	public Person copyPerson(Person p){
		Person copyP = new Person();
		copyP.name = p.name;
		copyP.age = p.age;
		return copyP;
	}
}