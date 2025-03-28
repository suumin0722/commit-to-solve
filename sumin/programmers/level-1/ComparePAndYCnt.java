/**
💡프로그래머스 - 문자열 내 p와 y의 개수
https://school.programmers.co.kr/learn/courses/30/lessons/12916

✅문제 설명
대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.

✅제한 조건
문자열 s의 길이 : 50 이하의 자연수
문자열 s는 알파벳으로만 이루어져 있습니다.

✅입출력 예
    s	   answer
"pPoooyY"	true
"Pyy"	    false
*/

class Solution {
    boolean solution(String s) {
        boolean answer = true;
		int pCnt = 0;
		int yCnt = 0;
		
		for(int i=0; i < s.length(); i++) {
			char c = s.charAt(i);
			if( c == 'p' || c == 'P'){
				pCnt++;
			} else if ( c == 'y' || c == 'Y') {
				yCnt++;
			}
		}
		
		if( pCnt != yCnt ) answer = false; 
		
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}

/**
✅잘한 점
 - 가독성이 좋고 로직이 명확
 - charAt()을 이용해서 메모리 효율도 좋음
 - 문제 조건(p, y가 없으면 true)도 자연스럽게 처리

❗아쉬운 점
 - answer 변수를 따로 둘 필요 없이 한 줄로도 리턴 가능
   => return pCnt == yCnt;

🔁복습 포인트
 - count 하나로 두 알파벳 개수를 비교(p 증가, y 감소)하여, 더 간결하고 변수 개수도 줄음
 - s.toLowerCase()로 대소문자 통일한 뒤 비교하여 조건이 간결함
	
	class Solution {
		boolean solution(String s) {
			s = s.toLowerCase();
			int count = 0;

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'p') count++;
				else if (s.charAt(i) == 'y') count--;
			}

			return count == 0;
		}
	}

 - stream API 사용해보기
 - 가독성은 좋으나, 성능은 for or foreach문보다 떨어짐
 - filter, count 등의 연산이 내부적으로는 Iterator + Lambda로 동작해서 비용 증가
 - 함수형 스타일은 언제 사용하면 좋은가?
   : 데이터가 많고, 가공/필터링/통계 연산이 필요할 때 사용
   
	class Solution {
		boolean solution(String s) {
			s = s.toUpperCase();
			return s.chars() //문자열은 문자로 쪼개기 위해 한글자씩 반복하여 IntStream으로 리턴 => 이 과정에서 IntStream 객체 생성(메모리에 stream 구조가 생기고, 각 연산을 연결된 상태로 저장)
					.filter(e -> e == 'P') //모든 요소에 람다함수 실행 => 함수 호출 비용 발생
					.count() //필터 후 최종적으로 또 이터레이션해서 개수 누적
				== s.chars()
					.filter(e -> e == 'Y')
					.count();
		}
	}
 
*/
