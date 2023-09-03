package review4;

public class E1NestedLoop {
    public static void main(String[] args) {
        for(int h=0;h<24;h++){
        for (int m = 0; m < 60; m++) {

            for (int s = 0; s <60 ; s++) {
                if(s<10 &&m<10){
                    System.out.println(h+":0"+m+":0"+s);
                }else if(s>=10 &&m<10){
                    System.out.println(h+":0"+m+":"+s);
                }else{
                    System.out.println(h+":"+m+":"+s);
                }

            }
        }

    }}
}
