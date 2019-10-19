class Solution {
  public String solution(int n) {
      String answer="";
      
      for(int i = 0; i<n; i++)
      {
          if(i%2==0) //2로 나눴을때 나머지가 0이라면
          answer += "수"; //"수" 추가
              
          else//아니라면
          answer += "박";//"박" 추가
          /*
          ex) n=3 이라면
          0~2까지 반복문이 돌게 된다.
            0   1     2
          "수" "박" "수"
          */
      }  
    return answer;

  }
}