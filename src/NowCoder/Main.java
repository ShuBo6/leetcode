package NowCoder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] wight = new int[n];
            for (int i = 0; i < n; i++) {
                wight[i] = scanner.nextInt();
            }
            int q = scanner.nextInt();
            int[][] data=new int[q][3];
            
            for (int i = 0; i < q; i++) {
                data[i][0] = scanner.nextInt();
                data[i][1] = scanner.nextInt();
                data[i][2] = scanner.nextInt();
                int count = 0;
                for (int j = data[i][0]; j < data[i][1]; j++) {
                    
                    if (wight[j] == data[i][2]) {
                        ++count;
                        
                    }
                    
                }
                System.out.println(count);
            }
        }
        

    }
}