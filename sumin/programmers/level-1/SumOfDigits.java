/**
💡프로그래머스 - 문자열을 정수로 바꾸기
https://school.programmers.co.kr/learn/courses/30/lessons/12925

✅문제 설명
문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

✅제한 조건
s의 길이는 1 이상 5이하입니다.
s의 맨앞에는 부호(+, -)가 올 수 있습니다.
s는 부호와 숫자로만 이루어져있습니다.
s는 "0"으로 시작하지 않습니다.

✅입출력 예
예를들어 str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다.
str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.
*/

class Solution {
    public int solution(String s) {
        int answer = Integer.parseInt(s);
        return answer;
    }
}

/**
✅잘한 점
 - 불필요한 로직 없이 parseInt()로 간결하게 처리함

❗아쉬운 점
 - parseInt() 없이 부호를 직접 처리하는 방식도 연습해보면 좋았을 것 같음

🔁복습 포인트
 - parseInt 없이 구현해보기
	/*
	class Solution {
		public int solution(String s) {
			//+: true, -:false
			boolean sign = true;
			int answer = 0;
			
			for(int i=0; i<s.length(); i++) {
				char ch = s.charAt(i);
				if(ch == '-') {
					sign = false;
				} else if(ch != '+') {
					answer = answer*10 + (ch - '0');
				}
			}
			return (sign ? 1 : -1) * answer;
		}
	}
	*/	
*/



