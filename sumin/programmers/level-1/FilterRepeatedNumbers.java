/**
💡프로그래머스 - 같은 숫자는 싫어
https://school.programmers.co.kr/learn/courses/30/lessons/12906

✅문제 설명
배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 
이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.

예를 들면,
arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.


✅제한 조건
배열 arr의 크기 : 1,000,000 이하의 자연수
배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수


✅입출력 예

arr	answer
[1,1,3,3,0,1,1]	[1,3,0,1]
[4,4,4,3,3]	[4,3]

*/

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
		List<Integer> list = new ArrayList<>();
		
		list.add(arr[0]);

		for(int i =1; i < arr.length; i++) {
			if(arr[i] != arr[i-1]){
				list.add(arr[i]);
			}
		}
		
        int[] answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}

/**
✅My풀이 복기
 - stream함수 사용해보았다

🔁다른 코드 복습
 - 배열 -> list 변환은 역시 반복문이 성능은 더 좋음
 - preNum = num 하면 향상된for문 사용 가능함
 
	public class Solution {
		public int[] solution(int []arr) {
			ArrayList<Integer> tempList = new ArrayList<Integer>();
			int preNum = 10;
			for(int num : arr) {
				if(preNum != num)
					tempList.add(num);
				preNum = num;
			}       
			int[] answer = new int[tempList.size()];
			for(int i=0; i<answer.length; i++) {
				answer[i] = tempList.get(i).intValue();
			}
			return answer;
		}
	}

*/
