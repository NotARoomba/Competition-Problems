import java.io.*;
import java.util.*;
public class QualificationQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int test = 0; test < sc.nextInt(); test++){
            int rows = sc.nextInt();
            int columns = sc.nextInt();
            int min = sc.nextInt();
            int[][] mat = new int[rows][columns];
            List<Integer> mat2 = new ArrayList<Integer>();
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    //mat[i][j] = sc.nextInt();
                    mat2.add(sc.nextInt());
                }
            }
            Collections.sort(mat2);
            Collections.reverse(mat2);
            int t = 0;
            for (int a : mat2) {
                t += a>=min?1:0;
            }
            System.out.println(t);
        }
    }
}