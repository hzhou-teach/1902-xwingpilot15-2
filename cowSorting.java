import java.util.Scanner;
import java.util.PrintWriter;
import java.util.File;

public class cowSorting {
    public static void main(String[] args) throws FileNotFoundException{
        PrintWriter pw = new PrintWriter(new File("herding.out"));
        Scanner sc = new Scanner(new File("herding.in"));
        int[] cows = new int[3];
        for(int i = 0; i < 3; i++){
            cows[i] = sc.nextInt();
        }
        Arrays.sort(cows);
        if(cows[2] = cows[0] + 2){
            pw.println(0);
        }else if(cows[1] == cows[0] + 2 || cows[2] == cows[1] + 2){
            pw.println(1);
        }else{
            pw.println(2);
        }
        pw.close();
    }
}
