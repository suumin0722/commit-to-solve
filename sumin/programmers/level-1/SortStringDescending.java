/**
💡프로그래머스 - 문자열 내림차순으로 배치하기
https://school.programmers.co.kr/learn/courses/30/lessons/12917

✅문제 설명
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.


✅제한 조건
str은 길이 1 이상인 문자열입니다.

✅입출력 예
	s		 return
"Zbcdefg"	"gfedcbZ"
*/


import java.util.*;

class Solution {
    public String solution(String s) {
        
		List<String> lower = new ArrayList<>();
		List<String> upper = new ArrayList<>();
		
		
		for(char c : s.toCharArray()) {
			if(Character.isLowerCase(c)) lower.add(String.valueOf(c));
			else upper.add(String.valueOf(c));
		}
		
		lower.sort(Collections.reverseOrder());
		upper.sort(Collections.reverseOrder());
		
        return String.join("", lower)+String.join("",upper);
    }
}

/**
✅My풀이 복기
 -stringBuilder를 사용하는 것으로 시작하다가 중간에 막혔는데 방법을 찾지 못하고 List로 빠짐😅

🔁다른 코드 복습
 -stringBuilder 활용해서 이렇게 초간단하게 풀 수 있었음
 -아스키코드.. 메모.. 기억하자(대문자 A가 65, 소문자 z가 122)

	import java.util.Arrays;

	public class ReverseStr {
		public String reverseStr(String str){
			char[] sol = str.toCharArray();
		Arrays.sort(sol);
		return new StringBuilder(new String(sol)).reverse().toString();
		}

		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		public static void main(String[] args) {
			ReverseStr rs = new ReverseStr();
			System.out.println( rs.reverseStr("Zbcdefg") );
		}
	}

*/
