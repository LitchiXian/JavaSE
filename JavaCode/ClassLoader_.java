import java.util.*;
import java.lang.reflect.*;
public class ClassLoader_{
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("������key");
		String key = sc.next();
		switch(key){
			case "1":
				Dog dog = new Dog();//��̬���أ������Ժ�ǿ
				dog.cry();
				break;
			case "2":
				//���� -> ��̬����
				Class cls = Class.forName("Person");//����̬���ء�
				Object o = cls.newInstance();
				Method m = cls.getMethod("hi");
				m.invoke(o);
				System.out.println("ok");
				break;
			default:
				System.out.println("do nothing..");
		}
	}
}

//��Ϊnew Dog()  �Ǿ�̬���أ���˱����д Dog
//Person�� �Ƕ�̬���أ����ԣ�û�б�дPersonҲ���ᱨ��ֻ�е���̬���ظ���ʱ���Żᱣ��
class Dog {
	public void cry(){
		System.out.println(" dog crying ...");
	}
}


class Person{
	public void hi(){
		System.out.println("people say hi...");
	}
}