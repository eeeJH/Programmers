# Programmers

💨 이 repository는 Programmers 문제와 개인 공부 내용이 포함되어 있습니다.



## 시간복잡도

### O(1) 

입력값(n)에 관계 없이 일정하게 문제 해결에 하나의 단계만을 거친다.

ex) 스택의 삽입(Push), 삭제(Pop)



### O($$log_2$$n)

문제 해결에 필요한 단계가 입력값(n) 또는 조건에 의해 감소한다.

ex) 이진트리(Binary Tree), 이진 검색(Binary Search)



### O(n)

문제 해결에 필요한 단계가 입력값(n)과 1:1의 관계를 가진다.

ex) 힙 정렬(Heap Sort), 2-Way 합병 정렬(Merge Sort)



### O(n$$log_2$$n)

문제 해결에 필요한 단계가 n($$log_2$$n)번 만큼 수행된다.

ex) 힙 정렬(Insertion sort), 쉘 정렬(Shell sort), 선택 정렬(Selection sort), 버블 정렬(Bubble sort), 퀵 정렬(Quick sort)



### O($$2^n$$)

문제 해결에 필요한 단계가 2의 입력값(n) 제곱만큼 수행된다.

ex) 피보나치 수열(Fibonacci Sequence)



## 완전탐색 (Exhaustive Search)

### Brute Force

단순히 for문과 if문 등으로 모든 case들을 만들어 답을 구하는 방법



### Bitmask

2진수를 이용하는 컴퓨터의 연산을 이용하는 방법 / 모든 부분집합을 구하는 방법



### Backtracking

해를 찾는 도중 해가 아니어서 막히면, 되돌아가서 다시 해를 찾아가는 방법



### 재귀

재귀 함수를 통해서 문제를 만족하는 경우들을 만들어가는 방법



### 순열

서로 다른 N개를 일렬로 나열하는 방법(N!)



### BFS

너비 우선 탐색 방법



### DFS

깊이 우선 탐색 방법





## Dynamic Programming

### 동적계획법

큰 문제 안에 작은 문제가 중첩되어있는 문제를 해결하는 데 사용하는 방법

구현하는 방식이 ***Bottom-up***과 ***Top-down*** 방식 두 가지

예) 피보나치 수열 

**Top-Down (재귀함수)**

```java
public class fib {

	public static void main(String arg[]) {
        // 5 출력
		System.out.println(fib(5));
	}

	public static int fib(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		
		return fib(n - 1) + fib(n - 2);

	}
}
```

피보나치 5 ( fib(5) )를 구하기 이해서는 다음과 같은 계산과정을 진행한다.

`fib(5)`

== fib(4) + fib(3)

== (fib(3) + fib(2)) + (fib(2) + fib(1))

== ((fib(2) + fib(1)) + (fib(1) + fib(0))) + ((fib(1) + fib(0)) + fib(1))

== (((fib(1) + fib(0)) + fib(1)) + (fib(1) + fib(0))) + ((fib(1) + fib(0)) + fib(1))

== 5



**Bottom-Up**

여기에서 중간에 **중복 호출이 발생**하기 때문에 **Memoization 기법**을 사용해줘야한다.

```java
public class fib {

	static int[] d;

	public static void main(String arg[]) {
		int n = 5;
		d = new int[n];
		
		// 5출력
		System.out.println(fib(n));
	}

	public static int fib(int n) {
		d[0] = 1;
		d[1] = 1;

		for (int i = 2; i < n; i++) {
			d[i] = d[i - 1] + d[i - 2];
		}

		return d[n - 1];
	}
}
```

for문을 통해서 계산에 쓸 d[0], d[1]을 *d*에 미리 저장하고, 이를 제외하고 *d*[i]에 값을 계산해서 저장한다.

