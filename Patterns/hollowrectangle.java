public class hollowrectangle{
    public static void main(String args[]){
        int m = 4;
        int n = 5;
        for(int i=1;i<=m;i++){
            for(int k=1;k<=n;k++){
                if(i>1 && i<m){
                if(k > 1 && k < n){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
                }
                else{
                    System.out.print("* ");
                }
        }
        System.out.println("");
    }
}
}