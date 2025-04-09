/**
💡프로그래머스 - 핸드폰 번호 가리기
https://school.programmers.co.kr/learn/courses/30/lessons/12948

✅문제 설명
프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

✅제한 조건
phone_number는 길이 4 이상, 20이하인 문자열입니다.

✅입출력 예
phone_number	return
"01033334444"	"*******4444"
"027778888"		"*****8888"
*/


class Solution {
    public String solution(String phone_number) {
        
		String masked = phone_number.substring(0, phone_number.length()-4).replaceAll(".", "*");
		String lastNum = phone_number.substring(phone_number.length()-4, phone_number.length());
		
		String answer = masked + lastNum;
		
        return answer;
    }
}

/**
✅잘한 점
 -가독성은 좋은 것 같음
 -정규식 활용 (replaceAll(".", "*")) 했으나, 검색해서 찾아봄ㅠ

❗아쉬운 점
 -substring()을 두 번 사용해서 약간 반복됨.. 
 -Java 11 이상이라면 "*".repeat(n)사용해서 substring() 두 번 안써도 됨
   => String masked = "*".(phone_number.length()-4);
 -replaceAll()에서 정규식 .은 의미 있는 문자라, 보안적 관점에선 이스케이프가 더 안전 ("\\.") 

🔁복습 포인트
 -char[] 사용한 코드, 문자 직접 조작해서 불필요한 문자열 객체 안 만듦 => 성능 Good
 -String.valueOf(char[])로 다시 문자열 만드는 거 기억해두기!!!!
	
	char[] ch = phone_number.toCharArray();
	for(int i = 0; i < ch.length - 4; i++){
		ch[i] = '*';
	}
	return String.valueOf(ch);

=============================================================================		

 -정규식 lookahead 사용, 엄청 간결하다..
 -(?=.{4})는 뒤에 문자가 4개가 남을 때까지의 문자들을 가리키는 것

	phone_number.replaceAll(".(?=.{4})", "*");

=============================================================================

 -StringBuilder 사용 => 성능 Good
 -대체로 실무나 코테에서 많이 쓰는 스타일
 -⭐⭐⭐StringBuilder는 문자열 누적에 가장 적합하다는 점 다시 한 번 기억!!!!!!!!!
	
	int size = phone_number.length();
	StringBuilder sb = new StringBuilder();
	for(int i=0; i<size-4; i++){
		sb.append("*");
	}
	sb.append(phone_number.substring(size-4, size));
	
	return sb.toString();

=============================================================================

 - += 반복은 문자열 연산 시마다 새로운 객체를 생성하므로 성능이 좋지 않음
 - 지금건 짧아서 괜찮지만, 길이가 커지면 비효율 발생

	String answer = "";
	for (int i = 0; i < phone_number.length() - 4; i++)
		answer += "*";
	answer += phone_number.substring(phone_number.length() - 4);

*/
