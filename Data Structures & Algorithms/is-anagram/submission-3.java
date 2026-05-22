class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
     ArrayList<Character> arr = new ArrayList<>();
     for(char ch : s.toCharArray())
     arr.add(ch);
     ArrayList<Character> arr2 = new ArrayList<>();
     for(char ch : t.toCharArray())
     arr2.add(ch);
      Collections.sort(arr);
      Collections.sort(arr2);
      for(int i = 0; i < arr.size(); i++) 
      if(!arr.get(i).equals(arr2.get(i))) return false;
      return true;
    }
}
