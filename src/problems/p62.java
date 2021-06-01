package problems;

import java.util.LinkedList;

public class p62 {
    public int lastRemaining(int n, int m) {
        int ans=0;
        for (int i = 2; i <= n; i++) {
            ans= (ans+m)%i;
        }
        return ans;
    }
}
