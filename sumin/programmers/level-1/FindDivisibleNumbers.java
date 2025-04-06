/**
💡프로그래머스 - 나누어 떨어지는 숫자 배열
https://school.programmers.co.kr/learn/courses/30/lessons/12910

✅문제 설명
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

✅제한 조건
arr은 자연수를 담은 배열입니다.
정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
divisor는 자연수입니다.
array는 길이 1 이상인 배열입니다.

✅입출력 예
arr	         divisor return
[5, 9, 7, 10]	5	[5, 10]
[2, 36, 1, 3]	1	[1, 2, 3, 36]
[3,2,6]	        10	[-1]
*/

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
		List<Integer> list = new ArrayList<>();
		
		for( int a : arr ) {
			if ( a % divisor == 0 ) {
				list.add(i);				
			}
			if( list.size() != 0 ) {
				for( int i = 0; i < list.size(); i++) {
					answer[i] = list.get(i);
				}
			} else {
				answer[0] = -1;
			}
		}
        return answer;
    }
}

/**
✅잘한 점
 - int 배열은 크기를 미리 지정해야하기 때문에 리스트를 사용하여 필요한 데이터만 삽입하기로 결정한 부분 

❗아쉬운 점
 - list 메서드 암기 필요

🔁복습 포인트
 - stream도 실무를 위해... 알아 두자!
	
	import java.util.*;
	import java.util.stream.*;

	class Solution {
		public int[] solution(int[] arr, int divisor) {
			int[] result = Arrays.stream(arr)
								 .filter(n -> n % divisor == 0)
								 .sorted()
								 .toArray();

			return result.length == 0 ? new int[]{-1} : result;
		}
	}
*/
