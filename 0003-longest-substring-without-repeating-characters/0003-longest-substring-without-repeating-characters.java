class Solution {
    public int lengthOfLongestSubstring(String A) {
        //BruteForce approach
      /*  int n=s.length();
        int ans=0;
        for(int start=0;start<n;start++){
            for(int end=start;end<n;end++){
                HashSet<Character> hs=new HashSet<>();
                for(int i=start;i<=end;i++){
                    hs.add(s.charAt(i));
                }
                if(hs.size()==(end-start+1)){
                    ans=Math.max(ans, end-start+1);
                }
                
            }
        }
        return ans;*/
        
        int n=A.length();
        HashSet<Character> hs=new HashSet<>();
        int l=0; int r=0; int ans=0;
        while(r<n){
            if(hs.contains(A.charAt(r))==false){
                hs.add(A.charAt(r));
            }else{
                ans=Math.max(ans, hs.size());
                while(A.charAt(l)!=A.charAt(r)){
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