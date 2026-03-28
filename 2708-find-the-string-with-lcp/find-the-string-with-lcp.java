class Solution {
    public String findTheString(int[][] lcp) {
        int n = lcp.length;
        char[] res = new char[n];
        for (int i = 0; i < n; i++) res[i] = '#';

        char ch = 'a';

        for (int i = 0; i < n; i++) {
            if (res[i] != '#') continue;
            if (ch > 'z') return "";

            for (int j = i; j < n; j++) {
                if (lcp[i][j] > 0) {
                    res[j] = ch;
                }
            }
            ch++;
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (res[i] == res[j]) {
                    int val = 1;
                    if (i + 1 < n && j + 1 < n) {
                        val += lcp[i + 1][j + 1];
                    }
                    if (lcp[i][j] != val) return "";
                } else {
                    if (lcp[i][j] != 0) return "";
                }
            }
        }

        return new String(res);
    }
}