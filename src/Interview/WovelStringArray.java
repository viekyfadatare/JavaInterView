package Interview;

public class WovelStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[] = { "abab", "india" };

		for (int i = 0; i < s.length; i++) {
			int count = 0;
			String s1 = s[i];
			for (int j = 0; j < s1.length(); j++) {

				if (s1.charAt(j) == 'a' || s1.charAt(j) == 'e' || s1.charAt(j) == 'i' || s1.charAt(j) == 'o'
						|| s1.charAt(j) == 'u') {
					count++;
				}

			}
			System.out.println(s[i] + "  ==  " + count);

		}

	}

}
