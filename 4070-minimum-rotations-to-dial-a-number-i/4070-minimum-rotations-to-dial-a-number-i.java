class Solution {
    public int minRotations(String s) {
       int pointer = 0;
       int rotations = 0;
       int n = s.length();
       for(int i = 0;i<n;i++){
         int pointer2 = s.charAt(i) - '0';
         int anti = Math.abs(pointer-pointer2);
         int min = Math.min(Math.abs(pointer-pointer2),Math.abs(10-anti));
         rotations += min;
         pointer = pointer2;

       }
       return rotations;
        
    }
}