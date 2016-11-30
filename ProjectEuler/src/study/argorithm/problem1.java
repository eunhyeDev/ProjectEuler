package study.argorithm;

/*
 * 2016.11.28 (eunhyeDev)
 */

public class problem1 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 15 == 0) {
				sum += i;
			} else {
				if (i % 3 == 0) {
					sum += i;
				} else if (i % 5 == 0) {
					sum += i;
				}
			}
		}

		System.out.println(sum);
	}
}
