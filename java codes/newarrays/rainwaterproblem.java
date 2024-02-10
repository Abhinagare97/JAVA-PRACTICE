public class rainwaterproblem {
    public static int trappedRainwater(int height[]){
        //calculate leftMax first
        int leftMax[] = new int [height.length];
        leftMax[0]= height[0];
        for(int i = 1; i < height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1] );
        }
        // calculate max of right side

        int rightMax[] = new int [height.length];
        rightMax[height.length-1]= height[height.length-1];
        for ( int j = height.length-2; j >= 0; j --){
            rightMax[j] = Math.max(height[j], height[j+1]);
        }
        int trappedwater= 0;
        // now we calculate the waterlevel with the help of min of leftmax and rightmax
        for( int i =1; i< height.length; i++){
            int waterlevel = Math.min(leftMax[i], rightMax[i]);

            trappedwater += waterlevel - height[i];

        }
        return trappedwater;
    }
    public static void main(String[] args){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(height) );
    }
}
