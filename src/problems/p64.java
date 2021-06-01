package problems;

public class p64 {
    public int sumNums(int n) {
        if (n==1){return 1;}

        return n+sumNums(n-1);
    }
//    还可以用等差数列的方式实现

    public static void main(String[] args) {
        System.out.println(new p64().sumNums(3));
        System.out.println(new p64().sumNums(9));
    }
}
