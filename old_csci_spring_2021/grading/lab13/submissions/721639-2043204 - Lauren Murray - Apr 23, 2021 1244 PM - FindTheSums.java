
public class FindTheSums {

	public static String arrayToString(int[][] a) {
		String res = "";
		for(int i = 0 ; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(j == a[i].length-1)
					res+=a[i][j];
				else
					res+=a[i][j] + " ";
			}
			if(i!=a.length-1)
				res+="\n";
			
			}
		return res;
	}
	public static int[][] horizontalSums(int[][] a,int sumToFind) {
		int[][] b = new int[a.length] [a[0].length];
		for(int i = 0; i < a.length; i++)
			for(int j = 0; j < a[i].length; j++)
				b[i][j] = 0;
	for(int i = 0; i < a.length; i++) {
		for(int j = 0; j < a[i].length; j++) {
			int sum = 0, k = j;
			while (k<a[i].length) {
				sum+=a[i][k];
				if(sum>sumToFind)break;
				if(sum==sumToFind) {
					for (int t=j;t<=k;t++)
						b[i][t] = a[i][t];
					break;
				}
				k++;
			}
		}
	}
	return b;
	}
	
	public static int[][] verticalSums(int[][] a, int sumToFind) {
		int[][] b = new int[a.length][a[0].length];
		for(int i =0; i < a.length; i++)
			for(int j =0; j < a[i].length; j++)
				b[i][j]=0;
			for(int i = 0; i < a[0].length; i++) {
				for(int j = 0; j <a.length; j++) {
					int sum=0, k=j;
					while (k<a.length) {
						sum+=a[k][i];
						if(sum>sumToFind)break;
						if(sum==sumToFind) {
							for(int t=j;t<=k;t++)
								b[t][i]=a[t][i];
							break;
						}
						k++;
					}
				}
			}
			return b;
	}

}








