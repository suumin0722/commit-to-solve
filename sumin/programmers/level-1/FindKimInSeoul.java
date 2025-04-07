/**
💡프로그래머스 - 서울에서 김서방 찾기
https://school.programmers.co.kr/learn/courses/30/lessons/12919

✅문제 설명
String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요.
seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

✅제한 조건
seoul은 길이 1 이상, 1000 이하인 배열입니다.
seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
"Kim"은 반드시 seoul 안에 포함되어 있습니다.

✅입출력 예
seoul				return
["Jane", "Kim"]	"김서방은 1에 있다"
*/


class Solution {
    public String solution(String[] seoul) {
        int answer = 0;

        for(int i=0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                answer = i;
                break;
            }
        }

        return "김서방은 "+answer+"에 있다";
    }
}

/**
✅잘한 점
 - break 사용. "Kim"을 찾는 순간 탐색을 멈춤으로써 실제 시간은 O(k)로 더 짧을 수 있음
 - equals() 사용	문자열 비교는 항상 == 말고 equals() 써야 하는 것 헷갈리지 않고 잘 씀! 

❗아쉬운 점
 - answer 초기화하지 않고 바로 for문 안에서 return했어도 됨

🔁복습 포인트
 - 향상된 for문을 사용할 수 도 있음. but 이것도 index를 따로 관리해야 하기 때문에 성능도 비슷. 코드 길이만 좀 더 짧음 
	
	class Solution {
		public String solution(String[] seoul) {
			int index = 0;
			for (String name : seoul) {
				if (name.equals("Kim")) break;
				index++;
			}
			return "김서방은 " + index + "에 있다";
		}
	}

 - Arrays.asList() → 내부적으로 O(n) / indexOf()도 O(n)
 - 총 O(n) + O(n) → O(n), but 중간에 break 못 함
 - 코드 가장 간결함
 - List<String> list = Arrays.asList(seoul); => asList는 배열을 list로 바꿔줌, 배열 기반 List를 반환하기 때문에 크기 변경 불가능!


 
	import java.util.Arrays;
	
	class Solution {
		public String solution(String[] seoul) {
			int index = Arrays.asList(seoul).indexOf("Kim"); 
			return "김서방은 " + index + "에 있다";
		}
	}
*/
