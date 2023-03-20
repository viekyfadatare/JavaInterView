package Interview;

import java.util.LinkedHashSet;

public class StringAcurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "test";
		
		LinkedHashSet<Character> lh = new LinkedHashSet<Character>();
		
		
		for (int i = 0; i < s.length(); i++) {
			lh.add(s.charAt(i));
		}
		
		for (Character ch : lh) {
			
			int count = 0;
			
			for (int i = 0; i < s.length(); i++) {
				
				if(ch==s.charAt(i)) {
					
					count++;
				}
			}
			System.out.println(ch +"   ====   "+ count);
			
		}
	}

}
