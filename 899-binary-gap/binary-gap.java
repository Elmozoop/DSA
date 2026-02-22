class Solution {
    public int binaryGap(int n) {
        int maxGap = 0;
      
        // Initialize previousPosition to a large value to handle edge case
        // where there's only one '1' bit (result should be 0)
        int previousPosition = 100;
        int currentPosition = 0;
      
        // Process each bit of n from right to left
        while (n != 0) {
            // Check if the current bit is 1
            if (n % 2 == 1) {
                // Update maximum gap between consecutive 1s
                maxGap = Math.max(maxGap, currentPosition - previousPosition);
                // Update previous 1's position for next comparison
                previousPosition = currentPosition;
            }
          
            // Move to the next bit position
            currentPosition++;
            // Right shift n by 1 to process the next bit
            n >>= 1;
        }
      
        return maxGap;
    }
}
