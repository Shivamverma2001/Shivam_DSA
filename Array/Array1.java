import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        int a[]={21,22,23,41};
        Scanner sc=new Scanner(System.in);
        int index=sc.nextInt();
        if(index<a.length)
        a[index]=a[index]+2;
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
