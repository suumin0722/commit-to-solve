/**
💡프로그래머스 - 정수 내림차순으로 배치하기
https://school.programmers.co.kr/learn/courses/30/lessons/12933

✅문제 설명
함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

✅제한 조건
n은 1이상 8000000000 이하인 자연수입니다.

✅입출력 예
  n	    return
118372	873211
*/

import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
		char[] charArr = String.valueOf(n).toCharArray();
		
		Arrays.sort(charArr);
		
		StringBuilder sb = new StringBuilder(new String(charArr));
		sb.reverse();
		
		answer = Long.parseLong(sb.toString());
		
        return answer;
    }
}

/**
✅잘한 점
 - 실용적, 성능 괜찮음
 
❗아쉬운 점
 - 서치해서 풀었음.. StringBuilder 알아두기 ! 

🔁복습 포인트
 - for문 사용해보기
 - s.toLowerCase()로 대소문자 통일한 뒤 비교하여 조건이 간결함
	
	class Solution {
		public long solution(long n) {
  
			char[] arr = String.valueOf(n).toCharArray();
			Arrays.sort(arr);
			
			for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
				char temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			return Long.parseLong(new String(arr));
		}
	}

 - String[] 사용 시, Collections.reverseOrder()로 바로 내림차순 정렬 가능해서 코드가 직관적
 - 객체 배열이기 때문에 Comparator 사용 가능
 - 가독성은 좋으나, 성능은 for or foreach문보다 떨어짐
 - String[]은 char[]보다 무겁다 → 메모리 사용량 증가
   split("") 은 내부적으로 많은 문자열 객체를 생성함 → 속도도 느림
   StringBuilder.append()에 문자열 여러 번 붙이게 됨
   
	class Solution {
		public long solution(long n) {
			String[] arr = String.valueOf(n).split("");
			Arrays.sort(arr, Collections.reverseOrder());
			StringBuilder sb = new StringBuilder();
			for (String s : arr) {
				sb.append(s);
			}
			return Long.parseLong(sb.toString());
	}

 -stream API 공부해보기
 -chars() => IntStream으로 바꿔주는거..
 -sorted() => 오름차순 정렬
 
	public class Solution {
		public long solution(long n) {
			String res = "";
			Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
			
			return Integer.parseInt(res);
		}
	}	
*/
