package offer;

public class p19 {
    public boolean isMatch(String s, String p) {
        int m=s.length();
        int n=p.length();
        boolean[][] f=new boolean[m+1][n+1];
        f[0][0]=true;
        for (int i = 0; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j-1)!='*'){
                    if (match(s,p,i,j)){
                        f[i][j]=f[i-1][j-1];
                    }

                }else {
                    f[i][j]=f[i][j-2];
                    if (match(s,p,i,j-1)){
                        f[i][j]=f[i][j] || f[i-1][j];
                    }
                }
            }
        }
        return f[m][n];
    }
    boolean match(String s, String p,int i,int j ){
        if (i==0){return   false;}
        if (p.charAt(j-1)=='.'){
            return  true;
        }
        return s.charAt(i-1)==p.charAt(j-1);

    }

    public static void main(String[] args) {
        System.out.println(new p19().isMatch("aa","a"));
        System.out.println(new p19().isMatch("aaa","ab*ac*a"));
        System.out.println(new p19().isMatch("aa","a*"));
        System.out.println(new p19().isMatch("ab","."));
        System.out.println(new p19().isMatch("aab","c*a*b"));
    }

}
