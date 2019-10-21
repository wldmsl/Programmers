Arrays.sortimport java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
    
        Arrays.sort(participant); //참가자 오름차순 정렬
        Arrays.sort(completion); //완주자 오름차순 정렬
        
        int i;
        
        for(i=0; i<completion.length; i++)
        {
            if(!participant[i].equals(completion[i])) //참가자와 완주자가 다르다면
            {
                answer = participant[i]; //그 사람이 완주하지 못한 선수
                return answer;
            }
        }
        
        answer = participant[i]; //다 조사해도 같으면 맨끝 선수가 완주하지 못한 선수 (한명은 꼭 완주를 못함)
        return answer;
  
    }
    public static void main(String []args)
    {
        Solution sol = new Solution();
        
        String[] n = {"leo", "kiki", "eden"};
        String[] n1 = {"eden","kiki"};
        String name = sol.solution(n,n1);
        
        String[] a = {"marina","josipa","nikola","vinko","filipa"};
        String[] a1 = {"josipa","filipa","marina","nikola"};
        String name1 = sol.solution(a,a1);
        
        String[] b = {"mislav","stanko","mislav","ana"};
        String[] b1 = {"stanko","ana","mislav"};
        String name2 = sol.solution(b,b1);
    }
    

}