/* Determine if a string has unique characters*/

/*
ASCII and UNICODE: different character encoding
ASCII: 128 characters mapped to 0-127, extended ASCII has 258 characters
UNICODE: A superset of ASCII, less than 2^21 characters
*/

public class IsUnique{

	public static void main(String args[]){
		System.out.println(IsUnique(args[0]));
	}

/* 
Time: O(n) 
	public static boolean IsUnique(String a){

		if (a.length() > 128) {
			return false;
		}

		For int, the default value is 0
		int [] map =  new int[128]; 
		for (int i = 0; i < a.length(); i++){
			if ( map[a.charAt(i)] > 0 ) {
				return false;
			}
			map[a.charAt(i)]++;
		}
		return true;
	}
*/

/*assume string letters are a-z, use bit vector*/
		public static boolean IsUnique(String a){

		int check =  0; 
		for (int i = 0; i < a.length(); i++){
			int cur = a.charAt(i) - 'a';
			if ( (check & (1 << cur)) > 0 ){
				return false;
			}
			check |= (1 << cur);
		}
		return true;
	}


}