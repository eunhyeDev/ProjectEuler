package study.argorithm;

/*
 * 2016.11.30 (eunhyeDev)
 * 1부터 100까지 "제곱의 합"과 "합의 제곱"의 차는?
 */

public class problem6 {

	private static int result1 = 0; // 제곱의 합
	private static int result2 = 0; // 합의 곱

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			result1 += i * i;
			result2 += i;
		}

		result2 = result2 * result2;

		System.out.println(result2 - result1);
	}
}
