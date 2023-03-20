package Interview;

public class FibonysesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[] = { "a", "try", "india", "aabb" };

		int a = 0;
		int b = 1;

		for (int i = 0; i < s.length; i++) {

			int n = s[i].length();

			boolean flag = false;
			for (int j = 0; j <= n; j++) {

				int c = a + b;

				if (c == n) {
					System.out.println("Yes === " + s[i]);

					flag = true;
					break;
				} else {
					a = b;
					b = c;
				}

			}

			if (flag == false) {

				System.out.println("This is not fibonysis  ===  " + s[i]);
			}
		}

	}

}
