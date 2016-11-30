package study.argorithm;


/*
 * 2016.11.29 (eunhyeDev)
 * 
 * 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?
 */

public class problem5 {

	// 소수와 소수의 제곱중에서 가장 큰 수를 곱하면 나누어 떨어지는 가장 작은 수를 구할 수 있다.

	// 소수와 소수의 제곱중 가장 큰 수들을 values에 곱함.
	public static int result = 1;
	public static int MAX_RANGE = 20;

	public static void main(String[] args) {
		for (int i = 2; i < MAX_RANGE; i++) {
			// 1. 범위 내에 소수를 찾는다.
			if (isPrime(i)) {
				// 2. 제곱하면 범위를 넘지 않는 소수(2,3)중에 제곱수(16,9)를 찾는다.
				// 3. 결과값(result)에 곱한다.
				if (i * i < MAX_RANGE) {
					result *= isPow(i);
				} else {
					// 4. 그 외의 소수도 곱한다.
					result *= i;
				}
			}
		}

		// 5.결과값 출력.
		System.out.println(result);
	}

	public static boolean isPrime(int value) {
		int i = 2;
		// 소인수의 가장 큰 값은 제곱근이므로 2부터 제곱근까지 Search.
		while (i <= Math.sqrt(value)) {
			if (value % i == 0) {
				return false;
			} else {
				i++;
			}
		}
		return true;
	}

	// 제한된 범위 내에서 제곱함수 있으면 제곱함수로 return
	// 2->4,8,16... 3->9,27,81...
	public static int isPow(int value) {
		int result = value;
		while (result * value < MAX_RANGE) {
			result *= value;
		}
		return result;
	}
}
