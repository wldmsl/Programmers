class Solution {
  public double solution(int[] arr) {
      double answer = 0;

  
      //반복문을 돌면서 arr[0] 부터 arr[n] 까지의 합을 배열의 길이로 나눈다!
      //반복문
      for(int i=0; i<arr.length; i++)
      {
          answer += arr[i];
      }
      answer = answer/arr.length;
      return answer;
  }
}