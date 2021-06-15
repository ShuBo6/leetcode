package SwordOfferReview;

public class p5 {

    public String replaceSpace(String s) {
        int len=s.length();
        char[] array=new char[len*3];
        int index=0;
        for (int i = 0; i < len; i++) {
            char temp=s.charAt(i);
            if (temp==' '){
                array[index++]='%';
                array[index++]='2';
                array[index++]='0';
            }else {
                array[index++]=temp;
            }
        }
        return new String(array,0,index);
    }

}
