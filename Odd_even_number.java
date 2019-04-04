package ndjq;

import java.util.Scanner;

public class Odd_even_number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		while (n != 1) {
			if (n % 2 == 0) {// 짝수
				n = n / 2;
			} else if (n % 2 == 1) { // 홀수
				n = (n * 3) + 1;
			}
			System.out.println(n);
		}
	}
}

/*
 * 어떤 정수 n에서 시작해, n이 짝수면 2로 나누고, 홀수면 3을 곱한 다음 1을 더한다. 이렇게 해서 새로 만들어진 숫자를 n으로 놓고,
 * n=1 이 될때까지 같은 작업을 계속 반복한다. 예를 들어, n=22이면 다음과 같은 수열이 만들어진다. 22 11 34 17 52 26
 * 13 40 20 10 5 16 8 4 2 1 n이라는 값이 입력되었을때 1이 나올때까지 만들어진 수의 개수(1을 포함)를 n의 사이클
 * 길이라고 한다. 위에 있는 수열을 예로 들면 22의 사이클 길이는 16이다. i와 j라는 두개의 수가 주어졌을때, i와 j사이의 모든
 * 수(i, j포함)에 대해 최대 사이클 길이를 구하라.
 */