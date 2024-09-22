public class PalindromePattern{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n; i++){
            int m=i;
            for(int j = n; j>i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print(m);
                m--;

            }
            for(int l = 2; l <= i; l++){
                System.out.print(l);
            }
            System.out.println("");
        }
    }
}