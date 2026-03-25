class Solution {
    public boolean canConstruct(String ransomNote, String magazine)
     {
         int []freq=new int[26];
    
         for(char ch: magazine.toCharArray())
         {
            freq[ch -'a']++;
         }
         for(char c :ransomNote.toCharArray())
         {
         freq[c-'a']--;
      //  String res=new String(arr);
        if(freq[c-'a']<0)
        {
            return false;
        }
     }
        return true;

    }
}