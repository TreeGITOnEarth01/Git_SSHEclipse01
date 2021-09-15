
public class shhTest {
	public shhTest() {
		System.out.println("Are you calling me?");
	}
	
	public static void main(String[] args) {
		shhTest sht = new shhTest();
		System.out.println("Yes, I am calling you!");
		int maxValue = Integer.MAX_VALUE;
		int minValue = Integer.MIN_VALUE;
		System.out.println(maxValue);
		System.out.println(minValue);
		//overflow
		System.out.println(maxValue + 1);
		//underflow
		System.out.println(minValue -1);
		int _value = 2_147_4_8_364_7;
		System.out.println("What is the underscore number: " + _value);
	}
}
