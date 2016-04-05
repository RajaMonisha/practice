public class RemoveDuplicates {
	//Function to remove duplicates from a string without using additional buffer
	public static void removeDup(String str) {
		char[] tmp = str.toCharArray();
		if(str.length()==0) {
			System.out.println("The string is empty");
			return;
		}
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(tmp[i]==tmp[j]) {
					tmp[j] = '\0';
				}
			}
		}
		str = String.valueOf(tmp);
		str = str.replaceAll("\\.+","");
		System.out.println(str);
	}
	public static void main(String[] args) {
		String str = new String("geeks for geeks");
		removeDup(str);
	}
}
