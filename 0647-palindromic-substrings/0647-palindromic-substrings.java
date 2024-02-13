class Solution {
    public static boolean isValid(String str, int i, int j){
        int n=str.length();
     while(i<j){
         if(str.charAt(i)!=str.charAt(j)){
            return false;
         }
        i++;
         j--;
     }
        return true;
    }
    public int countSubstrings(String s) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isValid(s, i, j)){
                    count++;
                }
            }
        }
        return count;
        
    }
}