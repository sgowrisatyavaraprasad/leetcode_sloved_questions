class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < asteroids.length; i++){
            if(!st.isEmpty() && asteroids[i] <= 0){
                int a = Math.abs(asteroids[i]);
                int c1 = 0 , c2 = 0;
                while(!st.isEmpty()){
                    if(!st.isEmpty()){
                        if(st.peek() < 0){
                            break;
                        }
                        if(st.peek() > a){
                            c1 += 1;
                            break;
                        }
                        else if(st.peek() < a){
                            c2 += 1;
                            st.pop();
                        }
                        else if(st.peek() == a){
                            c1 += 1;
                            st.pop();
                            break;
                        }
                    }
                }
                if(c1 == 0){
                    st.push(asteroids[i]);
                }
            }
            else{
                st.push(asteroids[i]);
            }
        }
        int c = 0;
        int[] arr = new int[st.size()];
        for(int i = 0; i < st.size(); i++){
            arr[c++] = st.get(i);
        }
        return arr;
    }
}