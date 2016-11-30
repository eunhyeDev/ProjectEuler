package study.argorithm;

/*
 * 2016.11.30 (eunhyeDev)
 * 10001번째의 소수
 */

public class problem7 {

	private static int result = 0;

	public static void main(String[] args) {
		int i = 3; // 3번째부터 시작, 2,3은 기본값으로 둠.
		int value = 3; // 3 이상부터 소수 판별

		// 1. 10001번째까지 값을 더해주면서 소수를 판별
		while (i < 10002) {
			value++;
			if (isPrime(value)) {
				i++;
			}
		}

		// 2. 출력
		System.out.println(value);
	}

	// 소수인지 판별하는 메소드
	public static boolean isPrime(int x) {
		for (int i = 2; i < Math.sqrt(x); i++) {
			if (x % i == 0) {
				return false;
			} else {
				if (i + 1 > Math.sqrt(x)) {
					return true;
				}
			}
		}
		return false;
	}
}
