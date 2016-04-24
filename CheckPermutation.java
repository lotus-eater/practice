import java.util.Arrays;

public class CheckPermutation {

	public static void main(String args[]) {
		System.out.println(IsPermutation(args[0], args[1]));
	}

/* sort characters */
	public static boolean IsPermutation(String a, String b) {
		return sort(a).equals(sort(b));
	}

	public static String sort(String a){
		a = a.toLowerCase();
		char [] arr = a.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
	
/* More efficient: check character counts 

	public static boolean IsPermutation(String a, String b) {
		if (a.length() != b.length()){
			return false;
		}

		a = a.toLowerCase();
		b = b.toLowerCase();

		int [] count = new int [128];
		for (int i = 0; i < a.length(); i++){
			count[a.charAt(i)]++;
		}
		for (int i = 0; i < b.length(); i++){
			count[b.charAt(i)]--;
		}

		for (int i = 0; i < count.length; i++){
			if (count[i] != 0){
				return false;
			}
		}

		return true;
	}
*/


}