import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class Revegetation {
    public static void main(String[] args) throws FileNotFoundException{
        PrintWriter pw = new PrintWriter(new File("revegetation.out"));
        Scanner sc = new Scanner(new File("revegetation.in"));
        int[] m1 = new int[151];
        int[] m2 = new int[151];
        int[] n = new int[101];
        int N = sc.nextInt();
        int M = sc.nextInt();
        for(int i = 0; i < M; i++){
            m1[i] = sc.nextInt();
            m2[i] = sc.nextInt();
            if(m2[i] < m1[i]){
                int med = m1[i];
                m1[i] = m2[i];
                m2[i] = med;
            }
        }
        
        for(int i = 1; i <= N; i++){
            int j = 0;
            for(j = 1; i <= 4; j++){
                boolean works = true;
                for(int x = 0; x < M; x++){
                    if(m2[x] == i && n[m1[x]] == x){
                        works = false;
                    }
                    if(works){
                        break;
                    }
                }
            }
            n[i] = j;
            pw.println(j);
        }
        pw.close();
    }
}