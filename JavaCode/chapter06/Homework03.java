public class Homework03{
	public static void main(String[] args){
		//ÐèÇó
		Book b = new Book();
		b.price = 160;
		b.updatePrice();
		// b.updatePrice();
		System.out.println(b.price);
	}

	
}

class Book{
	int price;
	public void updatePrice(){
		if (price > 150) {
			price = 150;
		}else if(price > 100){
			price = 100;
		}
	}
}