class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int max_light = 0;
        for(int light : lights)
        {
                if(light>max_light)
                {
                    max_light=light;
                }
        }
        int max_waiting=0;
        for(int time : arrivalTime)
        {
            int r = time % period;
            if(r >= max_light)
            {
                max_waiting = Math.max(max_waiting, period - r);
            }
        }
       return max_waiting;
        

    }
}