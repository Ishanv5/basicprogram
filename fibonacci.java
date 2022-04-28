import java.util.*;
class fibonacci{
    public static void main(String[] args) {
        int t1=0,t2=1,next,n;
        System.out.print("Enter value of n:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        System.out.print(t1+ " "+t2 + " ");
        for(int i=3;i<=n;i++){
            next=t1+t2;
            System.out.print(next+" ");
            t1=t2;
            t2=next;
        }
    }
}