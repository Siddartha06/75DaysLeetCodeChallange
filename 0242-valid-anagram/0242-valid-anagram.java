class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character>li = new ArrayList<>();
         if(s.length() != t.length()){
            return false;
        }
        for(int i =0;i<s.length();i++){
            li.add(s.charAt(i));
        }
        for(int i =0;i<t.length();i++){
            if(li.contains(t.charAt(i))){
                li.remove(Character.valueOf(t.charAt(i)));
               
            }
            else {
                return false;
            }
           
        }

        return true;
    }
}