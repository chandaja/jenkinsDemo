import java.util.Arrays;

public class Main {
public static void main(String[] args) {
        int j=2;
        int[] c={1,2,3,4,5,6,7,8,9,10};
        for(int l=0;l<j;l++){
        int t=c[0];
        for (int a=0;a<c.length-1;a++){
        c[a]=c[a+1];
        }
        c[c.length-1]=t;
        }
        System.out.println("left shift: "+ Arrays.toString(c));
        }
        }
