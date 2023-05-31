import java.util.Scanner;

//change to Main.java before submitting
public class Solution {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			char[] s = fs.next().toCharArray();
			char[] dna = "ATCG".toCharArray();
			char[] comp = "TAGC".toCharArray();
			for (char d : s) {
				for (int i = 0; i < 4; i++) {
					if (d == dna[i]) {
						System.out.print(comp[i]);
						break;
					}
				}
			}
			System.out.println();
		}
		fs.close();
	}
}
