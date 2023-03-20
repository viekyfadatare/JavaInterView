package Interview;

import java.util.LinkedHashSet;

public class AccurentOfCharecter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String st = "AAABBCCA";
		
		String s = st.toLowerCase();
		
		char[] ch = s.toCharArray();
		
		LinkedHashSet<Character> lh = new LinkedHashSet<Character>();
		
		for (int i = 0; i < ch.length; i++) {
			lh.add(s.charAt(i));
		}
		
		for (Character ch1 : lh) {
			
			int count = 0;
			
			for (int i = 0; i < ch.length; i++) {
				if(ch1 == s.charAt(i)) {
					 
					count++;
				}
			}
			System.out.println(ch1+""+count);

		}
		
			
		
	}

}
