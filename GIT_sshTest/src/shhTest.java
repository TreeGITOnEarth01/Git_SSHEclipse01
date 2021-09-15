
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
		
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);
		
		
	}
}
