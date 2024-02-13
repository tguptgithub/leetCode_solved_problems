class Solution {
    public static boolean isValidParen(Character ch){
        if(ch=='(' || ch=='{' || ch=='['){
            return true;
        }
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> st=new Stack();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(isValidParen(s.charAt(i))){
                st.push(s.charAt(i));
            }else{
                char bracket=s.charAt(i);
                if(st.isEmpty()){
                    return false;
                }
                if(bracket==')'){
                    if(st.peek()=='[' || st.peek()=='{')
                        return false;
                    else
                        st.pop();
                    
                } else if(bracket=='}'){
                    if(st.peek()=='(' || st.peek()=='[')
                        return false;
                       else
                        st.pop();
                }else if(bracket==']'){
                    if(st.peek()=='(' || st.peek()=='{')
                        return false;
                       else
                        st.pop();
                    
                }
                }
            
        }
      return st.isEmpty();
        
    }
}