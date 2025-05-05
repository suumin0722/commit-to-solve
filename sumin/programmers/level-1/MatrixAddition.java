/**
💡프로그래머스 - 행렬의 덧셈
https://school.programmers.co.kr/learn/courses/30/lessons/12950

✅문제 설명
행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.


✅제한 조건
행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.


✅입출력 예
    arr1			arr2			return
[[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
[[1],[2]]		[[3],[4]]		[[4],[6]]
*/


class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
		
		for(int i=0; i<arr1.length; i++){
			for(int k=0; k<arr1[i].length; k++){
				answer[i][k] = arr1[i][k] + arr2[i][k];
			}
		}
        return answer;
    }
}


/**
✅My풀이 복기
 - arr1에 arr2만 더해주는 방법도 있었음

🔁다른 코드 복습


*/
