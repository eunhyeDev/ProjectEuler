package study.argorithm;

import java.math.BigInteger;

/*
 *  2016.11.29 (eunhyeDev) 
 *  
 *  세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수(palindrome)는 얼마입니까?
 */

public class problem4 {

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
