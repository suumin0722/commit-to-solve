/**
💡프로그래머스 - 문자열 다루기 기본
https://school.programmers.co.kr/learn/courses/30/lessons/12918

✅문제 설명
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.


✅제한 조건
s는 길이 1 이상, 길이 8 이하인 문자열입니다.
s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.


✅입출력 예
  s		return
"a234"	false
"1234"	true
*/


class Solution {
    public boolean solution(String s) {
		boolean answer = true;
		
		for(char c : s.toCharArray()){
			if(!Character.isDigit(c)) {
				answer = false;
				return answer;
			}
		}	
		System.out.println(s.length());
		System.out.println(s.length() == 4);
		if(answer == true && !(s.length() == 4 || s.length() == 6)){
			answer = false;
		}
        return answer;
    }
}


/**
✅My풀이 복기
 -코드 자체는 안정적인거 같으나, 더 줄일 수 있으면 줄여보자

🔁다른 코드 복습
 -parseInt()로 숫자인지 판별. try-catch로 로직 처리.. 신기하지만 권장되는 방법은 아님
  
  class Solution {
	  public boolean solution(String s) {
		  if(s.length() == 4 || s.length() == 6){
			  try{
				  int x = Integer.parseInt(s);
				  return true;
			  } catch(NumberFormatException e){
				  return false;
			  }
		  }
		  else return false;
	  }
	} 

 - 정규식 사용
 
	import java.util.*;

	class Solution {
	  public boolean solution(String s) {
			if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
			return false;
	  }
	}

*/
