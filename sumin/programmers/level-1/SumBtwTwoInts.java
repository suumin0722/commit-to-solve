/**
💡프로그래머스 - 두 정수 사이의 합
https://school.programmers.co.kr/learn/courses/30/lessons/12912

✅문제 설명
두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

✅제한 조건
a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
a와 b의 대소관계는 정해져있지 않습니다.

✅입출력 예
a	b	return
3	5	12
3	3	3
5	3	12
*/

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
		int c = 0;
		
		if( a > b ) {
		c = a;
		a = b;
		b = c; 
		}
		
		for( int i = a; i <= b; i++) {
			answer += i;
		}
		
        return answer;
    }
}

/**
✅잘한 점
 - 조건 분기 로직이 명확하고, 흐름을 직관적으로 보여준다.

❗아쉬운 점
 - for문은 시간복잡도가 O(n)이므로, a와 b 값의 차이가 크면 성능이 매우 떨어짐

🔁복습 포인트
 - Math클래스 및 등차수열 공식 사용
 - a, b의 값이 크면 등차수열 공식에서 곱셈할 때 overflow 발생 가능성 있으므로, min과 max를 long타입으로 선언
 
	class Solution {
    public long solution(int a, int b) {
        long answer = 0;
		
		long min = Math.min(a, b);
		long max = Math.max(a, b);
		
		answer = (max - min + 1)*(min + max) / 2;
		
        return answer;
	}
*/	

