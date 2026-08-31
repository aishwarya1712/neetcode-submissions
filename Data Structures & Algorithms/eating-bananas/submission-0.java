class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // brute force
        int slowest = 1;
        
        int fastest = Integer.MIN_VALUE;
        for(int i = 0; i < piles.length; i++){
            fastest = Math.max(fastest, piles[i]);
        }

        // so slowest value is always 1, 
        // fastest value is always the max pile
        int k;
        while(slowest <= fastest){
            k = slowest + ((fastest - slowest)/2);
            int hours = 0;
            for (int pile : piles) {
                hours += Math.ceil((double) pile / k);
            }
            if(hours <= h){
                fastest = k - 1;
            } else {
                // we have to go faster
                slowest = k + 1;
            }
        }
        return slowest;
        
    }
}
