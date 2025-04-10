/**
💡프로그래머스 - 가운데 글자 가져오기
https://school.programmers.co.kr/learn/courses/30/lessons/12903

✅문제 설명
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

✅제한 조건
s는 길이가 1 이상, 100이하인 스트링입니다.

✅입출력 예
	s	return
"abcde"	 "c"
"qwer"	 "we"
*/


class Solution {
    public String solution(String s) {
        
		char[] arr = String.valueOf(s).toCharArray();
		int i = 0;
		
		if(arr.length % 2 != 0) {
			i = Math.round(arr.length / 2);
			s = Character.toString(arr[i]);
			
			System.out.println(i);
			System.out.println(s);
		} else {
			i = arr.length / 2;
			s = Character.toString(arr[i-1]) + Character.toString(arr[i]);
			
			System.out.println(i);
			System.out.println(s);
		}
        return s;
    }
}

/**
✅잘한 점
 -흠.. 돌아돌아 통과만 됨..

❗아쉬운 점
 -불필요하게 문자열을 char 배열로 바꿨다..
 -Math.round() 사용 할 필요도 없었다..

🔁복습 포인트
 -wow..왜 이렇게 생각이 안날까
	
	class Solution {
		public String solution(String s) {
			return s.substring((s.length()-1)/2, s.length()/2 + 1);
	    }
	}
=============================================================================		

 -substring 쓰면 간단한 문제였다ㅠㅠ
	
	class Solution {
		public String solution(String s) {
		int len = s.length();
		int mid = len / 2;
		return (len % 2 == 0)
			? s.substring(mid - 1, mid + 1)
			: s.substring(mid, mid + 1);
		}
	}

*/
