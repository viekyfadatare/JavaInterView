package Interview;

public class Wovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "ShwetaDharshan";
		
		char[] ch = s.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			
			
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='i'||ch[i]=='u') {
				count++;
			}
		}
		
		System.out.println(s + "  ====  "+count);

	}

}
