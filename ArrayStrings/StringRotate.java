public class StringRotate {
	public static void isStringRotate(String str1,String str2) {
		str1 = str1 + str1;
		if(str1.contains(str2)) {
			System.out.println("Strings are rotation of each other");
		} else {
			System.out.println("Strings are not rotation of the other");
		}
	}
	public static void main(String[] args) {
		String str1 = new String("hello world");
		String str2 = new String("llo worldhe");
		isStringRotate(str1,str2);
	}
}