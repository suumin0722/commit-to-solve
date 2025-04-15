/**
💡프로그래머스 - 약수의 개수와 덧셈
https://school.programmers.co.kr/learn/courses/30/lessons/77884

✅문제 설명
두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서,
약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.


✅제한 조건
1 ≤ left ≤ right ≤ 1,000

✅입출력 예
left	right	result
13		17		43
24		27		52
*/

import java.util.*;

class Solution {
    public int solution(int left, int right) {
		int answer = 0;
		
		for(int i=left; i<=right; i++) {
			Map<Integer, Integer> map = new HashMap<>();
			int n = i;
			for(int k=2; k<=n; k++) {
				while(n%k == 0) {
					map.put(k, map.getOrDefault(k,0)+1);
					n /= k;
				}
			}
			
			int totalDivisors = 1;
			for(int v : map.values()) {
				totalDivisors *= (v+1);
			}
			
			if(totalDivisors % 2 == 0) {
				answer += i;
			} else {
				answer -= i;
			}
		}

        return answer;
    }
}

/**
✅My풀이 복기
 -소인수분해 통해서 약수 개수 구하는 방법으로 풀었는데, 반복문이 많다보니 조금 헷갈렸음

🔁다른 코드 복습
 -제곱수 활용

	class Solution {
		public int solution(int left, int right) {
			int answer = 0;

			for (int i=left;i<=right;i++) {
				//제곱수인 경우 약수의 개수가 홀수
				if (i % Math.sqrt(i) == 0) {
					answer -= i;
				}
				//제곱수가 아닌 경우 약수의 개수가 짝수
				else {
					answer += i;
				}
			}

			return answer;
		}
	}

 -완전 탐색 (시간복잡도 : O(n²))
 
	class Solution {
		public int solution(int left, int right) {
			int answer = 0;
			for(int i=left; i<=right; i++){
				int cnt = 0;
				for(int j=1; j<=i; j++){
					if(i%j==0) cnt++;
				}
				if(cnt%2==0) answer += i;
				else answer -= i;
			}
			return answer;
		}
	}

	위 for문을 아래와 같이 바꿔 제곱수 활용하면 시간복잡도 더 효율적
	j*j<=i를 통해 O(√n) 으로 줄일 수 있음
	for (int j = 1; j * j <= i; j++) {
		if (i % j == 0) {
			cnt += (j * j == i) ? 1 : 2; 
		}
	}
*/
