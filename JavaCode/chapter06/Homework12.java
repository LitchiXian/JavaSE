public class Homework12{
	public static void main(String[] args){
		//需求
		Employee em = new Employee("litchi", '男', 21, "服务端工作人员", 22000);
		System.out.println(em.name + "\n" + 
			em.sex + "\n" + em.age + "\n" + 
			em.work + "\n" + em.fee);
	}

	
}

class Employee{
	String name;
	char sex;
	int age;
	String work;
	double fee;

	public Employee(){}

	public Employee(String name,char sex,int age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public Employee(String work, double fee){
		this.work = work;
		this.fee = fee;
	}

	public Employee(String name, char sex, int age, String work, double fee){
		this(name,sex,age);
		this.work = work;
		this.fee = fee;
	}
}