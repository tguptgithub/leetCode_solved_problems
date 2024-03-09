class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            boolean flag=true;
            while(st.size()>0 && asteroids[i]<0 && st.peek()>0){
                if(-asteroids[i]>st.peek()){ //opposite direction but smaller value needs to be exploit
                    st.pop();
                }else if(-asteroids[i]<st.peek()){
                    flag=false;
                    break;
                }else{
                    flag=false;
                    st.pop();
                    break;
                }
            }
            if(flag){
                st.push(asteroids[i]); //when we have positive direction they never collide
            }
          
        }
        int[] arr=new int[st.size()];
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=st.pop();
        }
        return arr;
    }}