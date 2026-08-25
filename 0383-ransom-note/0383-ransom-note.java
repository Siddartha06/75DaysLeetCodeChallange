class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        ArrayList<Character>hs = new ArrayList<>();
        for(int i =0;i<magazine.length();i++){
            char ch = magazine.charAt(i);
            hs.add(ch);
        }
        for(int i =0;i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
   
            if (!hs.contains(ch)){
                return false;
            }
            hs.remove((Character) ch);

        }
        return true;
    }
}