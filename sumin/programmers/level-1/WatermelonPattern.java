/**
💡프로그래머스 - 수박수박수박수박수박수?
https://school.programmers.co.kr/learn/courses/30/lessons/12922

✅문제 설명
길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.


✅제한 조건
n은 길이 10,000이하인 자연수입니다.

✅입출력 예
n	return
3	"수박수"
4	"수박수박"
*/


class Solution {
    public String solution(int n) {
        String answer = "";
		
		for(int i = 1; i <= n; i++) {
			if(i % 2 != 0) {
				answer += "수";
			} else {
				answer += "박";
			}
		}
        return answer;
    }
}

/**
✅My풀이 복기
 -for문을 벗어나 볼 필요가 있음

🔁다른 코드 복습
 -이 방법은 생각하지 못했는데 창의적인듯
 
	 public class WaterMelon {
		public String watermelon(int n){
		   return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
		}
	 }
	 
 -stringBuilder 쓸까하다가 안썼는데, 역시 누적은 이게 성능이 더 좋다
	
	class Solution {
		public String solution(int n) {
			StringBuilder sb = new StringBuilder();

			for (int i = 1; i <= n; i++) {
				sb.append(i % 2 != 0 ? "수" : "박");
			}
			return sb.toString();
		}
	}

*/
