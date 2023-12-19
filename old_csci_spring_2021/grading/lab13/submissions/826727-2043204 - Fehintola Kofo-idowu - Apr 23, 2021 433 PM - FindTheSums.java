public class FindTheSums {
	public static String arrayToString(int[][] a) {
		String hold= "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				hold += a[i][j];
				if (j < a[0].length - 1)
					hold += " ";
			}
			if (i < a.length - 1)
				hold += "\n";
		}
		return hold;
	}
	
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		//create b array
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < b.length; i++)
			for (int j = 0; j < b[0].length; j++)
				b[i][j] = 0;
		
		//nested loop search
		for (int i = 0; i < a.length; i++) { //rows
			for (int j = 0; j < a[0].length; j++) { //columns
				int sum = 0, count = 0;
				for (int k = j; k < a[0].length; k++) { //search loop
					if (sum < sumToFind) {
						sum += a[i][k];
						count++;
					}
				}
				if (sum == sumToFind) { //update b array
					for (int k = 0; k < count; k++)
						b[i][j + k] = a[i][j + k];
				}
			}
		}
		return b;
	}
	
	public static int[][] verticalSums(int[][] a, int sumToFind) {
		//create b array
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < b.length; i++)
			for (int j = 0; j < b[0].length; j++)
				b[i][j] = 0;
		
		//nested loop search
		for (int i = 0; i < a[0].length; i++) { //columns
			for (int j = 0; j < a.length; j++) { //rows
				int sum = 0, count = 0;
				for (int k = j; k < a.length; k++) { //search loop
					if (sum < sumToFind) {
						sum += a[k][i];
						count++;
					}
				}
				if (sum == sumToFind) { //update b array
					for (int k = 0; k < count; k++)
						b[j+k][i] = a[j+k][i];
				}
			}
		}
		return b;
	}
	
	
}