package Interview;

public class CountVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s [] = {"mahipal","sunil","meesaq" };
		
		for (int i = s.length-1; i >=0 ; i--) {

			char [] ch = s[i].toCharArray();
			int count =0;
			for (int j = 0; j < ch.length; j++) {
				
				if(ch[i] == 'a' || ch[i] == 'i' || ch[i] == 'e' || ch[i] == 'o' || ch[i] == 'u') {
					count++;
				}
				
			}
			
			
		}
		

	}

}
