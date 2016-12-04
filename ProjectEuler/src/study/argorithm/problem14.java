package study.argorithm;

/*
 * 2016.12.2 - 3 (eunhyeDev)
 *
 * 양의 정수 n에 대하여, 다음과 같은 계산 과정을 반복하기로 합니다.
 * n → n / 2 (n이 짝수일 때)
 * n → 3 n + 1 (n이 홀수일 때)
 * 백만(1,000,000) 이하의 수로 시작했을 때 1까지 도달하는데 가장 긴 과정을 거치는 숫자는 얼마입니까?
 */
public class problem14 {
	private static long maxCount = 0L; // 가장 긴 과정의 횟수.
	private static long maxNumber = 0L; // 가장 긴 과정을 거치는 숫자.

	public static void main(String[] args) {
		Long startTime = System.currentTimeMillis();

		long i = 2L;

		// 1. 백만이하까지 getCount 메소드를 이용해 계산과정을 반복한다.
		while (i < 1000001) {

			// 3. 반환된 횟수가 비교해 더 크면 maxCount로 세팅하고, maxNumber도 바꿔준다.
			if (getCount(i) > maxCount) {
				maxCount = getCount(i);
				maxNumber = i;
			}
			i++;
		}

		// 4. 가장 긴 과정을 거치는 숫자 출력
		System.out.println(maxNumber);

		Long endTime = System.currentTimeMillis();
		System.out.println("수행시간 : " + (endTime - startTime) + " ms");
	}

	// 2. 짝수/홀수대로 계산하고 1이되면 반복문을 나와 과정의 횟수를 반환한다.
	public static long getCount(long number) {
		long i = number;
		long mCount = 1;
		while (i != 1l) {
			if (i % 2 == 0) {// 짝수
				i = i / 2;
			} else {
				i = i * 3 + 1;
			}
			mCount++;
		}

		return mCount;

	}
}
