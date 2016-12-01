package study.argorithm;

/*
 * 2016.12.1 -2 (eunhyeDev)
 * 2백만 이하 소수의 합은 얼마입니까?   
 */

public class problem10 {

	private static boolean[] resultArr = null;
	private static long sum = 0; // 합의 크기가 int형 범위를 넘으므로 long으로 선언.

	public static void main(String[] args) {
		resultArr = eratos(2000000);

		for (int i = 0; i < resultArr.length; i++) {
			if (resultArr[i]) {
				System.out.println(i + "번째 소수 : " + i);
				sum += i;
			}
		}

		System.out.println(sum);
	}

	// "에라토스테네스의 체"를 이용한 범위 내의 소수 구하기.
	public static boolean[] eratos(int range) {
		boolean[] isPrime = new boolean[range];

		for (int a = 2; a < range; a++) {
			isPrime[a] = true;
		}

		for (int i = 2; i < Math.sqrt(range); i++) {
			if (isPrime[i]) {

				for (int j = i; i * j < range; j++) {
					isPrime[i * j] = false;
				}
			}
		}
		return isPrime;
	}

}
