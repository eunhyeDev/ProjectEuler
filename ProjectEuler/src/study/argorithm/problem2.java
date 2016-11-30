package study.argorithm;

/*
 * 2016.11.28 (eunhyeDev)
 */

public class problem2 {
	public static void main(String[] args) {
		long sum = 2;
		long value = 0;
		long first = 1, second = 2;

		int i = 3;

		while (value <= 4000000) {

			value = first + second;

			if (value % 2 == 0) {
				System.out.println(i + "번째 값 : " + value);
				sum += value;
				System.out.println(i + "번째 합 : " + sum);
			}

			i++;

			first = second;
			second = value;
		}
		System.out.println(sum);
	}
}
