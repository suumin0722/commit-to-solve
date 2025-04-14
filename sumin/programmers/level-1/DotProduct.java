/**
💡프로그래머스 - 내적
https://school.programmers.co.kr/learn/courses/30/lessons/70128

✅문제 설명
길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.

이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)



✅제한 조건
a, b의 길이는 1 이상 1,000 이하입니다.
a, b의 모든 수는 -1,000 이상 1,000 이하입니다.

✅입출력 예
a				b			result
[1,2,3,4]	[-3,-1,0,2]		3
[-1,0,1]	[1,0,-1]		-2
*/


class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
		
		for(int i = 0; i<a.length; i++) {
			answer += a[i]*b[i];
		}
        return answer;
    }
}

/**
✅My풀이 복기
 -for문이 직관적이긴함

🔁다른 코드 복습
 -streamAPI 사용한거도 보기
	

	import java.util.stream.IntStream;

	class Solution {
		public int solution(int[] a, int[] b) {
			return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
		}
	}

*/
