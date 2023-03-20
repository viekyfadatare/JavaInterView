package Interview;

public class Whowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Vikasratna";

		String s2 = s.toLowerCase();

		char[] s3 = s2.toCharArray();

		int count = 0;

		for (int i = 0; i < s3.length; i++) {

			
			if (s3[i] == 'a' || s3[i] == 'i' || s3[i] == 'e' || s3[i] == 'o' || s3[i] == 'u') {

				count++;

			}
			System.out.print(s3[i]);
			
		}
		System.out.print( " wovel in the give string is ==  " +count);


	}

}
