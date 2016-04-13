public class ReplaceSpaces {
	public static void main(String[] args) {
		String str = new String("hello 	world");
		str = str.replaceAll("\\s","%20");
		System.out.println(str);
	}
}