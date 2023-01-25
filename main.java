import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner io=new Scanner(System.in);
        int lst[][]=new int[5][5];
        int c=0,i,j;
        int lst2[]=new int[5];
        int lst3[]=new int[5];
        for(i=0;i<5;i++){
            System.out.println("line "+(i+1)+" solders and civilians :");
            for(j=0;j<5;j++){
                lst[i][j]=io.nextInt();
                if (lst[i][j]==1){
                    c=c+1;
                }
            }
            lst2[i]=c;
            lst3[i]=c;
            c=0;
        }
        for(i=0;i<5;i++){
            System.out.println("row "+i+": "+lst2[i]);
        }
        Arrays.sort(lst2);
        
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                if(lst2[i]==lst3[j]){
                    System.out.print(j);
                }
            }
        }
    }
}
