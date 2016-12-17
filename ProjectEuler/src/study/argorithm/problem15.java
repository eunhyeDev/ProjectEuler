package study.argorithm;

import java.math.BigInteger;

/*
 * 2016.12.17 - 1 (eunhyeDev)
 *
 * 20 × 20 격자에는 모두 몇 개의 경로가 있습니까?
 * 참조 : http://cafe.naver.com/suhui/16977542
 * (1-2. 파스칼의 삼각형을 활용한 풀이)를 이용함.
 */
public class problem15 {
	private static long[][] num = null; //
	private static int max = 21;
	private static int x, y, m, n;

	public static void main(String[] args) {
		num = new long[21][21];
		for (int i = 0; i < 21; i++) {
			for (int j = 0; j < max; j++) {
				num[i][j] = 1;
			}
		}
		System.out.println("result=" + move());
	}

	// (1-2. 파스칼의 삼각형을 활용한 풀이)를 이용함.
	public static long move() {
		for (x = 1, y = 0; x < max; x++, y++) {
			for (m = 1, n = 0; m < max; m++, n++) {
				num[m][x] = num[m][y] + num[n][x];
				System.out.println("x=" + x + ", y=" + y + ", m=" + m + ", n="
						+ n);
				System.out.println("num[m][x]=" + num[m][x]);
			}
		}
		return num[max - 1][max - 1];
	}

}
