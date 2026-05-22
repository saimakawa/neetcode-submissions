class Solution {
    public boolean hasDuplicate(int[] nums) {
       Set<Integer> set = new HashSet<>();
       boolean isDuplicate = false;
       for(int n : nums) 
     {
          if(!set.add(n)) {
            isDuplicate = true;
            break;
          }
     }
     if(isDuplicate) return true;
     return false;
      
    }
}