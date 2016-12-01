package study.argorithm;

/*
 * 2016.12.1 -1 (eunhyeDev)
 * a + b + c = 1000 인 피타고라스 수 a, b, c는 한 가지 뿐입니다. 이 때, a × b × c 는 얼마입니까?
 * 
 * 이 문제를 통해서 나오는 식은 3가지가 있다.
 * 1. a+b+c = 1000
 * 2. a^2+b^2 = c^2
 * 3. a+b>c
 * 
 * 1의 식을 통해 유추되는 식은 c = 1000 - (a+b)
 * 3의 식을 통해 유추되는 식은 [a+b>1000-(a+b)] -> [2(a+b)>1000] -> [a+b>500] -> [b>500-a]  
 */

public class problem9 {
	public static void main(String[] args) {
		// 수행시간 계산
		Long startTime = System.currentTimeMillis();

		int total = 1000;
		int half = total / 2;
		int a = 100, b = 100, c = 100; // 최소 100이상은 되어야 2개의 식이 성립되므로.
		int result = 0;

		// a와 b를 증가시키면서 조건이 성립되면 나와서 출력하는 방식.

		while (a < half) { // 3번 응용.
			// 2번 조건이 성립되면 a 루프도 나감.
			if ((Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))) {
				break;
			} else {
				a++;

				// 3번 응용.
				b = half - a;
			}

			while (b < half) { // 3번 응용.
				b++;
				c = total - (a + b); // 1번 응용

				// 2번 조건이 성립되면 결과값 result에 담고 b 루프 나감.
				if ((Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
						&& ((a + b) > c)) {
					result = a * b * c;
					break;
				}
			}
		}
		System.out.println("a : " + a + ", b : " + b + ", c : " + c);
		System.out.println("결과값 : "+result);

		Long endTime = System.currentTimeMillis();
		System.out.println("수행시간 : " + (endTime - startTime) + " ms");
	}
}
