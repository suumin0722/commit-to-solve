/**
💡프로그래머스 - 최대공약수와 최소공배수
https://school.programmers.co.kr/learn/courses/30/lessons/12940

✅문제 설명
두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.


✅제한 조건
두 수는 1이상 1000000이하의 자연수입니다.


✅입출력 예

n	m	return
3	12	[3, 12]
2	5	[1, 10]

*/

class Solution {
    public int[] solution(int n, int m) {
        
		if(n > m) {
			int temp = m;
			m = n;
			n = temp;
		}
        
        int a = n;
        int b = m;
		
		//최대공약수
		while(b != 0){			
			int temp = b;
            b = a % b;
            a = temp;			
		}
		int gcd = a;
		int lcm = (m * n) / gcd;
		
		
        return new int[] {gcd, lcm};
    }
}


/**
✅My풀이 복기
 - 최대공약수 : 
	
	예시: 20과 12
	큰 수 ÷ 작은 수
		→ 20 ÷ 12 = 1...8 (나머지 8)

	그다음, 
		12 ÷ 8 = 1...4 (나머지 4)

	다시,
		8 ÷ 4 = 2...0 (나머지 0)
	→ 나머지가 0이 됐을 때, 그 앞에 나눈 수 4가 최대공약수!
 
 - 최소공배수 = 두수의곱/최대공약수
 

🔁다른 코드 복습
 - 재귀함수를 쓰면 for문을 쓰지 않아도 된다..
 
	class TryHelloWorld {
      public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];

          answer[0] = gcd(a,b);
        answer[1] = (a*b)/answer[0];
        return answer;
    }

   public static int gcd(int p, int q)
   {
    if (q == 0) return p;
    return gcd(q, p%q);
   }
}

*/
