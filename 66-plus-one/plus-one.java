class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] test1 = {1, 2, 3};
        int[] result1 = sol.plusOne(test1);
        System.out.println(java.util.Arrays.toString(result1));
        
        int[] test2 = {9, 9, 9};
        int[] result2 = sol.plusOne(test2);
        System.out.println(java.util.Arrays.toString(result2));
        
        int[] test3 = {1, 2, 9};
        int[] result3 = sol.plusOne(test3);
        System.out.println(java.util.Arrays.toString(result3));
    }
}