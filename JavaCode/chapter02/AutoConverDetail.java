public class AutoConverDetail{
	public static void main(String[] args){
		char n1 = 1;
		short n2 = 1;
		// n2 = n1;
		// n1 = n2;


		byte b1 = 1;
		byte b2 = 2;
		short s1 = 1;

		//short s2 = b1 + s1;//不对，byte + short ==> int
		int i1 = b1 + s1;

		//byte b3 = b1 + b2;//不对，byte运算完 ==> int

	}
}