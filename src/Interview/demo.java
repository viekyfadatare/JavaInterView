package Interview;

public class demo {

	public static void main(String[] args) {

		String a = "aabbccdd";

		String[] ch = a.split("");

		int count = 0;
		
		for (int i = 0; i < ch.length; i++) {

			for (int j = i+1; j < ch.length; j++) {

				if (ch[i] == ch[j]) {
					count++;
				}
			}

			//System.out.println(count);
		}
		System.out.println(count);
	}

}
