class Solution {
    public int maxVowels(String s, int k) {
        Queue<Character> q = new LinkedList<>();
        int count = 0;
        int max = 0;
        int n = s.length();
        for (int i = 0;i<k;i++){
             q.add(s.charAt(i));
             if(isVowel(s.charAt(i))){
                count++;
             }
             
        }
        max = count;

        for(int i =k;i<n;i++){
           char removed = q.poll();
            if (isVowel(removed)) {
                count--;
            }
            q.add(s.charAt(i));
            if(isVowel(s.charAt(i))){
                count++;
             }
             max = Math.max(max,count);
             
        } 
        return max;
    }


     public boolean isVowel( char ch){
         if( ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
            return true;
         }
          return false;  
     }    
     
}