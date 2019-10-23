class Solution {
  public int solution(int n) {
      int answer = 2; // 2와 3은 소수이기 때문에 2개를 먼저 카운트에 넣어줌

      
      for(int i=4; i<=n; i++) //4부터 시작
      {
        if(!(i%2==0) && !(i%3==0)) //2와 3으로 나누어지지 않는다면 소수
        {
            answer +=1; //카운트 추가
        }
      }
        return answer;
}
  
}