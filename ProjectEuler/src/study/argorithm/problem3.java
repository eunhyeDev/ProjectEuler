package study.argorithm;

import java.math.BigInteger;

/*
 *  2016.11.29 (eunhyeDev)
 * 
 * 어떤 수를 소수의 곱으로만 나타내는 것을 소인수분해라 하고, 이 소수들을 그 수의 소인수라고 합니다.
 * 예를 들면 13195의 소인수는 5, 7, 13, 29 입니다.
 * 600851475143의 소인수 중에서 가장 큰 수를 구하세요.
 */

public class problem3 {

	// 값이 너무 커서 BigInteger형식으로 받아옴.
	private static BigInteger value = new BigInteger("600851475143");
	// 여기에 가장 큰 소인수를 저장.
	private static BigInteger maxValue = new BigInteger("0");

	public static void main(String[] args) {
		System.out.println(getMaxPrime(value));
	}

	public static BigInteger getMaxPrime(BigInteger value) {

		// 1. 2부터 시작해서 나누어 떨어지는 값을 찾는다.
		for (BigInteger i = BigInteger.valueOf(2); i.compareTo(value) < 0; i = i
				.add(BigInteger.ONE)) {

			// 2. 나누어 떨어지는 수가 비교해서 크면 큰 소인수로 저장.
			if (value.mod(i).equals(new BigInteger("0"))
					&& (i.compareTo(maxValue) > 0)) {
				maxValue = i;

				// 3. 몫값으로 다시 나누어 떨어지는 값을 찾는다. (재귀)
				return getMaxPrime(value.divide(i));

				// 4. 더이상 나눠지지 않으면 가장 큰 소인수 return.
			} else if (i.equals(value.subtract(new BigInteger("1")))) {
				return value;
			}
		}
		return value;
	}
}
