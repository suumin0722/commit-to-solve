/**
💡프로그래머스 - 제일 작은 수 제거하기
https://school.programmers.co.kr/learn/courses/30/lessons/12935

✅문제 설명
정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

✅제한 조건
arr은 길이 1 이상인 배열입니다.
인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.

✅입출력 예
arr			return
[4,3,2,1]	[4,3,2]
[10]		[-1]
*/


class Solution {
    public int[] solution(int[] arr) {
		if(arr.length == 1) {
			return new int[]{-1};
		}
		
		int iMin = arr[0];
		for(int i : arr) {
			iMin = Math.min(i,iMin);
		}
		
		int[] answer = new int[arr.length -1];
		int idx = 0;
		for(int i : arr) {
			if( i != iMin) {
				answer[idx++] = i;
			}
		}		
        return answer;
    }
}

/**
✅My풀이 복기
 -최솟값은 구했는데, 새로운 배열 만드는데서 버벅임
 -배열 길이가 1일 때 새로 배열 생성 할 필요 없었음 => arr[0] = -1; 그냥 대입만 해도 됨
 -streamAPI가 좀 더 느리다고 하지만.. 다음에는 써볼 수 있도록 더 공부가 필요할듯함

🔁다른 코드 복습
 -리스트 공부용 !
	
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	class Solution {
	  public int[] solution(int[] arr) {
		if (arr.length == 1) {
			arr[0] = -1;
			return arr;
		} else {
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			for (int a : arr) {
				arrayList.add(a);
			}
			Integer minimum = Collections.min(arrayList);
			arrayList.remove(minimum);
			int[] resultArray = new int[arr.length - 1];
			for (int i = 0; i < arrayList.size(); ++i) {
				resultArray[i] = arrayList.get(i);
			}
			return resultArray;
		}
	  }
	}
=============================================================================		

 -streamAPI 정리 필요 
	
	import java.util.Arrays;
	import java.util.stream.Stream;
	import java.util.List;
	import java.util.ArrayList;

	class Solution {
	  public int[] solution(int[] arr) {
		  if (arr.length <= 1) return new int[]{ -1 };
		  int min = Arrays.stream(arr).min().getAsInt();
		  return Arrays.stream(arr).filter(i -> i != min).toArray();
	  }
	}

*/
