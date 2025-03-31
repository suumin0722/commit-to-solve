/**
💡프로그래머스 - 정수 제곱근 판별
https://school.programmers.co.kr/learn/courses/30/lessons/12934

✅문제 설명
임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

✅제한 조건
n은 1이상, 50000000000000 이하인 양의 정수입니다.

✅입출력 예
n	 return
121	  144
3	  -1
*/

class Solution {
    public long solution(long n) {
        long answer = 0;
		double x = Math.sqrt(n);
		
		if( x == (long)x ) {
			answer = (long)(x+1) * (long)(x+1);
		} else {
			answer = -1;
		}
        return answer;
    }
}

/**
✅잘한 점
 - Math.sqrt() 메서드 잘 활용함
 - 시간복잡도 O(1) 으로 빠름

❗아쉬운 점
 - 정수로 계산하지 않고, 실수로 계산한 뒤 형변환하여 실수 계산에서 오차가 생길 가능성이 있음

🔁복습 포인트
 - Math.pow() 사용해서 거듭제곱 구하기
 - Math.pow()는 리턴값이 double이므로, 큰 수에서 오차 발생 가능성이 있으나 코드가 좀 더 깔끔함
	
	class Solution {
	  public long solution(long n) {
		  if (Math.pow((int)Math.sqrt(n), 2) == n) {
			  return (long) Math.pow(Math.sqrt(n) + 1, 2);
		  }
		  return -1;
	  }
	}

 - 이진 탐색 활용, 시간복잡도 O(log n)
 - 큰 수를 다루거나 정확도가 중요할 땐 이 방법이 더 안전함
   
	class Solution {
		public long solution(long n) {
			long left = 1, right = n;
			while (left <= right) {
				long mid = (left + right) / 2;
				long square = mid * mid;

				if (square == n) {
					return (mid + 1) * (mid + 1);
				} else if (square < n) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
			return -1;
		}
	}
 
*/
