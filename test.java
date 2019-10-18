

class Solution {

	public String solution(String s) {

		String answer = "";

		String[] arr = s.split(""); //문자열을 공백으로 구분!



		int index = 0;  //숫자를 새는 index변수를 0으로 초기화



		for(String temp : arr) {

			if(temp.equals(" ")) {

				//공백이 있다면 0으로 초기화

				index = 0;

			} else {				

				index = index + 1;

			}

			if(index%2 != 0) {

				//index 번호가 홀수일 때 대문자로 

		

				temp = temp.toUpperCase();

			}



			answer += temp;

		}



		return answer;

	}

}