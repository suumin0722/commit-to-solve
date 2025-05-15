/**
💡프로그래머스 - 직사각형 별찍기
https://school.programmers.co.kr/learn/courses/30/lessons/12969

✅문제 설명
이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.


✅제한 조건
n과 m은 각각 1000 이하인 자연수입니다.


✅입출력 예

입력
-----
5 3

출력
-----
*****
*****
*****

*/


import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int i = 0; i < m; i++){
            for(int k = 0; k < n; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/**
✅My풀이 복기
 

🔁다른 코드 복습

*/
