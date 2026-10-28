class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = temperatures.length;
        int[] arr = new int[n];
        for(int i = n-1; i >=0 ; i--){
            int curr = temperatures[i];

            while(!stack.isEmpty() && temperatures[stack.peek()] <= curr){
                stack.pop();
            }
            if(stack.isEmpty()){
                arr[i] =0;
            }else
            arr[i] = stack.peek()-i;
            stack.push(i);

        }


        return arr;

        // //brute force
        // int n = temperatures.length;
        // int[] arr = new int[n];
        // for(int i = 0; i < n; i++){
        //     int curr = temperatures[i];
        //     arr[i] = 0;
        //     innerLoop:
        //     for(int j = i+1; j < n ; j++){
        //         if(temperatures[j] > curr){
        //             arr[i] = j-i;
        //             break innerLoop;
        //         }
        //     }
        // }
        // return arr;
    }
}