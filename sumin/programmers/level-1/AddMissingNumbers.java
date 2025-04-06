/**
💡프로그래머스 - 없는 숫자 더하기
https://school.programmers.co.kr/learn/courses/30/lessons/86051

✅문제 설명
0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

✅제한 조건
1 ≤ numbers의 길이 ≤ 9
0 ≤ numbers의 모든 원소 ≤ 9
numbers의 모든 원소는 서로 다릅니다.

✅입출력 예
numbers				result
[1,2,3,4,6,7,8,0]	14
[5,8,4,0,6,7,9]		6
*/

class Solution {
    public int solution(int[] numbers) {
		int answer = 0;
		
		for(int k = 0; k <= 9; k++) {
			boolean missing = true;
			for(int i = 0; i < numbers.length; i++) {
				if(numbers[i] == k) {
					missing = false;
					break;
				}
			}
			if(missing) {
				answer += k;
			}
		}
        return answer;
    }
}

/**
✅잘한 점
	- 직관적임

❗아쉬운 점
 - 이중 반복문이 사용되어 시간 복잡도가 O(10n)

🔁복습 포인트
 - 수학적 사고를 통해 더 간단한 풀이가 있었음

	class Solution {
		public int solution(int[] numbers) {
			int sum = 45; // 0 + 1 + 2 + ... + 9 = 45
			for (int num : numbers) {
				sum -= num;
			}
			return sum;
		}
	}
 
 - [참고]계수 정렬 (Counting Sort)
	- 시간 복잡도: O(n + k)
	- 값 자체를 인덱스로 하는 배열을 이용해 각 숫자가 몇 번 나왔는지 세는 방식의 정렬 알고리즘
	
	int[] count = new int[10];
	for (int num : numbers) {
		count[num]++;
	}
*/
