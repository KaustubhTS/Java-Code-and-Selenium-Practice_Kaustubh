package Kaustubh_Programming_Practice;

public class RabinKarpAlgorithmForSearching {

	private static final int PRIME = 101;
	private static final int MOD = 1000000007;

	private long calculateHash(String str, int length) {
		long hash = 0;
		for (int i = 0; i < length; i++) {
			hash = (hash * PRIME + str.charAt(i)) % MOD;
		}
		return hash;
	}

	private long updateHash(long prevHash, char oldChar, char newChar, long highestPow) {
		long hash = (prevHash - oldChar * highestPow % MOD + MOD) % MOD;
		hash = (hash * PRIME + newChar) % MOD;
		return hash;
	}

	public void search(String text, String pattern) {

		int n = text.length();
		int m = pattern.length();

		if (m > n) {
			System.out.println("Pattern length is greater than text length");
			return;
		}

		long highestPow = 1;
		for (int i = 1; i < m; i++) {
			highestPow = (highestPow * PRIME) % MOD;
		}

		long patternHash = calculateHash(pattern, m);
		long textHash = calculateHash(text, m);

		for (int i = 0; i <= n - m; i++) {

			if (patternHash == textHash) {
				if (text.substring(i, i + m).equals(pattern)) {
					System.out.println("Pattern found at index: " + i);
				}
			}

			if (i < n - m) {
				textHash = updateHash(textHash, text.charAt(i), text.charAt(i + m), highestPow);
			}
		}
	}

	public static void main(String[] args) {
		RabinKarpAlgorithmForSearching rk = new RabinKarpAlgorithmForSearching();
		rk.search("kaustubhandnikitaloveseachotherlovelovelove   love", "love");
	}
}
