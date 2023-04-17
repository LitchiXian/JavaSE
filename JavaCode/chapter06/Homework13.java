public class Homework13{
	public static void main(String[] args){
		//ÐèÇó
		PassObject b = new PassObject();
		b.printAreas(new Circle(), 10);
	}

	
}

class Circle{
	double radius;//°ë¾¶
	public Double findArea(){
		return Math.PI * radius * radius;
	}
}

class PassObject{
	public void printAreas(Circle c, int times){
		System.out.println("Radius\tArea");
		for (int i = 1; i <= times; ++i) {
			c.radius = i;
			System.out.println(c.radius + "\t" + c.findArea());
		}
		
	}
}