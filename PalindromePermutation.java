public class PalindromePermutation {
	
	public static void main(String args[]) {
		System.out.println(ifPalindrome(args[0]));
	}

	public static boolean ifPalindrome(String a){

		/*
		can also check if the char is space
		*/
		a = a.replaceAll("\\s", "");
		a = a.toLowerCase();
		int len = a.length();
		int [] count = new int [128];
		
		/* 
		Solution 1 
		Map:

		even length: all even counts
		odd length: at most one char with odd count
		=> string with no more than one char with odd count

		for (int i = 0; i < len; i++){
			count[a.charAt(i)]++;
		}

		 
		boolean oddCount = false;
		for (int i = 0; i < len; i++){
			if (count[a.charAt(i)] % 2 == 1){
					if (oddCount){
						return false;
					}
					oddCount = true;
			}
		}
		return true;

		*/	

		/*
		Solution 2
		Use bit vector
		*/

		int bitVector = 0;
		for (int i = 0; i < len; i++){
			int val = a.charAt(i) - 'a';
			int flag = 1 << val;
			if ((bitVector & flag) == 0){
				bitVector |= flag;
			} else {
				bitVector &= ~flag;
			}
		}

		return bitVector == 0 || ( ((bitVector - 1) & bitVector) == 0 );

	}

}