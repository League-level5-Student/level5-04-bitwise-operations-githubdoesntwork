package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public void printByteBinary(byte b) {
		System.out.println(new Integer((int)b).toBinaryString(b));
	}
	
	public void printShortBinary(short s) {
		System.out.println(new Integer((int)s).toBinaryString(s));
	}
	
	public void printIntBinary(int i) {
		System.out.println(new Integer((int)i).toBinaryString(i));
	}
	
	public void printLongBinary(long l) {
		System.out.println(new Long(l).toBinaryString(l));
	}
	public BinaryPrinter() {
		printByteBinary((byte)1);
		printShortBinary((short)2);
		printIntBinary(7);
		printLongBinary(8);
	}
	public static void main(String[] args) {
		BinaryPrinter a = new BinaryPrinter();
	}
}
