public class CheckForUnique {
	//Function to check if a string has unique charaters
	public static void checkUnique(String str) {
		char[] tmp = str.toCharArray();
		if(str.length()==0) {
			System.out.println("The string is empty");
			return;
		}
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(tmp[i]==tmp[j]) {
					System.out.println("String has repeated characters");
					return;
				}
			}
		}
		System.out.println("String has all unique characters");
		//Alternate method is to sort and then search for unique characters
	}
	public static void main(String[] args) {
		String str = new String("abcde");
		checkUnique(str);
	}
}
