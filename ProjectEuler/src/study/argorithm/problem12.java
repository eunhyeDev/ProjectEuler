package study.argorithm;

/*
 * 2016.12.2 - 1 (eunhyeDev)
 * 
 * 1부터 n까지의 자연수를 차례로 더하여 구해진 값을 삼각수라고 합니다.
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55 ...
 * 500개 이상의 약수를 갖는 가장 작은 삼각수는 얼마입니까?
 */

public class problem12 {
	private static int count = 0;

	public static void main(String[] args) {
		System.out.println(searchNumber());
	}

	// 1. 삼각수를 구한다.
	public static int searchNumber() {
		int i = 1, beforeValue = 0, value = 0;

		// 3. 약수가 500개 이상이면 출력한다.
		while (count < 500) {

			// i번째 삼각수는 전 값에서 현재 값만 더해주면 된다.
			// 2:1(전의 삼각수)+2 = 3, 3: 3(전의 삼각수)+3 = 6, 4: 6+4 = 10
			value = beforeValue + i;
			count = divisorCount(value);

			beforeValue = value;
			i++;
		}
		return value;
	}

	// 2. 약수갯수를 구한다.
	public static int divisorCount(int number) {
		int mCount = 0;
		for (int i = 2; i < Math.sqrt(number); i++) {
			if (number % i == 0) {
				mCount++;
				// 4같은 경우는 4%2 = 0, 4/2 = 2로 같으므로 한번만 더한다.
				if (i != (number / i)) {
					mCount++;
				}
			}
		}
		return mCount;
	}
}
