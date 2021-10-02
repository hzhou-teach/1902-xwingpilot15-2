import java.util.Scanner;

public class cowSorting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Array = new int[N];
        for(int i = 0; i < N; i++){
            Array[i] = sc.nextInt();
        }
        int bruh = 0;
        for(int i = Array.length - 1; i > 0; i--){
            if(Array[i] == Array[i - 1] + 1){
                bruh++;
            }
        }
        System.out.println(bruh);
    }
}
