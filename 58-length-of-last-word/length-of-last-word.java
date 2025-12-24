class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            
            if (ch == ' ' && len > 0) {
                break;
            } else if (ch != ' ') {
                len++;
            }
        }
        
        return len;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Example 1: " + solution.lengthOfLastWord("Hello World"));
        System.out.println("Example 2: " + solution.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println("Example 3: " + solution.lengthOfLastWord("luffy is still joyboy"));
    }
}