class Solution {
    public int lengthOfLongestSubstring(String A) {
        HashSet<Character> hs=new HashSet<>();
        int n=A.length();
        int l=0;
        int r=0;
        int ans=Integer.MIN_VALUE;
      while(r<n){
          if(hs.contains(A.charAt(r))==false){
              hs.add(A.charAt(r));
          }else{
               ans=Math.max(ans, hs.size());
              while(A.charAt(r)!=A.charAt(l)){
                  hs.remove(A.charAt(l));
                  l++;
             }
             
              
              l++;
          }
          r++;
      }
          ans=Math.max(ans, hs.size());
        return ans;
    }
}