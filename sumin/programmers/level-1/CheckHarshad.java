/**
💡프로그래머스 - 하샤드 수
https://school.programmers.co.kr/learn/courses/30/lessons/12947

✅문제 설명
양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

✅제한 조건
x는 1 이상, 10000 이하인 정수입니다.

✅입출력 예
x	return
10	true
12	true
11	false
13	false
*/

class Solution {
    public boolean solution(int x) {
		
		char[] arr = String.valueOf(x).toCharArray();
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i] - '0';
		}
		
        return x % sum == 0;
    }
}

/**
✅잘한 점
 - char배열로 바꾼 x를 '0'을 빼서 숫자로 변형한 뒤 계산한 점

❗아쉬운 점
 - 스트림 방식이 여전히 낯설어서 for문 사용

🔁복습 포인트
 -char[]가 아닌 String[]을 사용 + parseInt()와 함께
 -split("")을 사용한 문자열 처리가 toCharArray보다 무거울 수 있음
 -parseInt() 또한 메서드 호출한 것이기 때문에 오버헤드 또는 약간 느릴 수 있음
	class Solution {
		public boolean solution(int x) {
			String[] digits = String.valueOf(x).split("");
			int sum = 0;
			for (String d : digits) {
				sum += Integer.parseInt(d);
			}
			return x % sum == 0;
		}
	}
 
 - while문을 사용한 수학적 방법
 - 성능이 가장 좋으며, 알고리즘에 자주 등장하는 케이스
	
	class Solution {
		public boolean solution(int x) {
		int num = x, sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return x % sum == 0;
	}

 - 스트림 방식(람다)
 - 한 줄 코드로 매우 간결하지만, 항상 성능 면에서는 좀 떨어짐
   
	class Solution {
		public boolean solution(int x) {
		int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
		return x % sum == 0;
		}
	}
*/
