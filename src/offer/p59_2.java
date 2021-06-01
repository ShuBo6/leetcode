package offer;

import DataStructure.MaxQueue;

public class p59_2 {
    public static void main(String[] args) {
        MaxQueue maxQueue=new MaxQueue();
//        maxQueue.push_back(1);
//        maxQueue.push_back(2);
//        System.out.println(maxQueue.max_value());
//        System.out.println(maxQueue.pop_front());
//        System.out.println(maxQueue.max_value());
        
        String[] ins=
                {"MaxQueue","max_value","pop_front","max_value","push_back","max_value","pop_front","max_value","pop_front","push_back","pop_front","pop_front","pop_front","push_back","pop_front","max_value","pop_front","max_value","push_back","push_back","max_value","push_back","max_value","max_value","max_value","push_back","pop_front","max_value","push_back","max_value","max_value","max_value","pop_front","push_back","push_back","push_back","push_back","pop_front","pop_front","max_value","pop_front","pop_front","max_value","push_back","push_back","pop_front","push_back","push_back","push_back","push_back","pop_front","max_value","push_back","max_value","max_value","pop_front","max_value","max_value","max_value","push_back","pop_front","push_back","pop_front","max_value","max_value","max_value","push_back","pop_front","push_back","push_back","push_back","pop_front","max_value","pop_front","max_value","max_value","max_value","pop_front","push_back","pop_front","push_back","push_back","pop_front","push_back","pop_front","push_back","pop_front","pop_front","push_back","pop_front","pop_front","pop_front","push_back","push_back","max_value","push_back","pop_front","push_back","push_back","pop_front"};
        int[][] vals={{},{},{},{},{46},{},{},{},{},{868},{},{},{},{525},{},{},{},{},{123},{646},{},{229},{},{},{},{871},{},{},{285},{},{},{},{},{45},{140},{837},{545},{},{},{},{},{},{},{561},{237},{},{633},{98},{806},{717},{},{},{186},{},{},{},{},{},{},{268},{},{29},{},{},{},{},{866},{},{239},{3},{850},{},{},{},{},{},{},{},{310},{},{674},{770},{},{525},{},{425},{},{},{720},{},{},{},{373},{411},{},{831},{},{765},{701},{}} ;
        for (int i = 1; i < ins.length; i++) {
            System.out.print(i+":\t");
            if (ins[i].equals("max_value")){
                System.out.println("max_value"+ maxQueue.max_value());;
            }
            if (ins[i].equals("pop_front")){
                System.out.println("pop_front"+ maxQueue.pop_front());;
            }
            if (ins[i].equals("push_back")){
                System.out.println("push_back"+vals[i][0]);
                 maxQueue.push_back(vals[i][0]);
            }
        }
    }
}
//[null,-1,-1,-1,null,46,46,-1,-1,null,868,-1,-1,null,525,-1,-1,-1,null,null,646,null,646,646,646,null,123,871,null,871,871,871,646,null,null,null,null,229,871,837,285,45,837,null,null,140,null,null,null,null,837,806,null,806,806,545,806,806,806,null,561,null,237,806,806,806,null,633,null,null,null,98,866,806,866,866,866,717,null,186,null,null,268,null,29,null,866,239,null,3,850,310,null,null,770,null,674,null,null,770]
//[null,-1,-1,-1,null,46,46,-1,-1,null,868,-1,-1,null,525,-1,-1,-1,null,null,646,null,646,646,646,null,123,871,null,871,871,871,646,null,null,null,null,229,871,837,285,45,837,null,null,140,null,null,null,null,837,806,null,806,806,545,806,806,806,null,561,null,237,806,806,806,null,633,null,null,null,98,866,806,866,866,866,717,null,186,null,null,268,null,29,null,866,239,null,3,850,310,null,null,770,null,674,null,null,770]