class Solution {
  public String solution(int n) {
      String answer="";
      
      for(int i = 0; i<n; i++)
      {
          if(i%2==0) //2�� �������� �������� 0�̶��
          answer += "��"; //"��" �߰�
              
          else//�ƴ϶��
          answer += "��";//"��" �߰�
          /*
          ex) n=3 �̶��
          0~2���� �ݺ����� ���� �ȴ�.
            0   1     2
          "��" "��" "��"
          */
      }  
    return answer;

  }
}