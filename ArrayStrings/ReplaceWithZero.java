import java.*;
import java.util.Arrays;
public class ReplaceWithZero {
	public static void main(String[] args) {
		int[][] arr = {{9,8,0},{4,0,6},{1,2,3}};
		int i,j;
		int rows[] = new int[arr.length];
		int cols[] = new int[arr.length];
		Arrays.fill(rows, -1);
		Arrays.fill(cols, -1);
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[0].length;j++) {
				if(arr[i][j] == 0) {
					rows[i] = i;
					cols[j] = j;
				}
			}
		}
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[0].length;j++) {
				if(rows[i] != -1 || cols[j]!= -1){
					arr[i][j] = 0;
				}
				System.out.print(arr[i][j]);
				System.out.print("  ");
			}
			System.out.println("\n");
		}
	}
}