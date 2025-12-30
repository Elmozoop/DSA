public class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        
        while (columnNumber > 0) {
            columnNumber--;
            result.append((char)('A' + columnNumber % 26));
            columnNumber /= 26;
        }
        
        return result.reverse().toString();
    }
    
    public int titleToNumber(String columnTitle) {
        int result = 0;
        
        for (int i = 0; i < columnTitle.length(); i++) {
            result = result * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        
        return result;
    }
}