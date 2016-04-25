public class URLify{
	public static void main(String args[]){
		System.out.println( urlify(args[0], Integer.parseInt(args[1])) );
	}

	public static String urlify(String a, int trueLength){
		char [] arr = a.toCharArray();
		int spaceCount = 0;
		for (int i = 0; i < trueLength; i++){
			if (arr[i] == ' '){
				spaceCount++;
			}
		}
		StringBuilder result = new StringBuilder(2 * spaceCount + trueLength);
		for (int i = 0; i < trueLength; i++){
			if (arr[i] != ' '){
				result.append(arr[i]);
			} else {
				result.append("%20");
			}
		}
		return result.toString();
	}

}