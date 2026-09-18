class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int count = 0;
        int max = 0;

        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
           if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u'){
            count++;
              }  
        }
         max = count;

            for(int i = k;i<s.length();i++){
             if(s.charAt(left) == 'a' || s.charAt(left) == 'e' || s.charAt(left) == 'i' || s.charAt(left)== 'o'|| s.charAt(left) == 'u'){
            count--;
              }
               if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i)== 'o'|| s.charAt(i) == 'u'){
            count++;
              } 
              left++;
              max = Math.max(count,max);
            }
              return max;
    
    }
}