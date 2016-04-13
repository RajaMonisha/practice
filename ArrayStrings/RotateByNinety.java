import java.*;
public class RotateByNinety {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int b[][] = new int[arr[0].length][arr.length];
		int i,j,m,n;
		
		for(i=0,n=arr.length-1;i<3;i++,n--) {
			for(j=0,m=0;j<4;j++,m++) {
				System.out.print(arr[i][j]);
				System.out.print("  ");
				b[m][n] = arr[i][j];
			}
			System.out.println("\n");
		}
		System.out.println("Array rotated by 90 degree:\n");
		for(i=0;i<b.length;i++) {
			for(j=0;j<b[0].length;j++) {
				System.out.print(b[i][j]);
				System.out.print("  ");
			}
			System.out.println("\n");
		}
	}
}