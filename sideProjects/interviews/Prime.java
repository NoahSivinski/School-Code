public class Prime {
    public static void main (String[] args) {
	int count = 0;
	int num = 1;
	while (count <= 10001) {
	    if (isPrime(num)) {
		count++;
	    } // if
	    num++;
	} // while
	num--;
	System.out.println(num);
    } // main

    public static boolean isPrime(int num) {
	 boolean flag = true;
	 for (int i = 2; i <= num / 2; ++i) {
	     // condition for nonprime number
	     if (num % i == 0) {
		 flag = false;
		 break;
	     }
	 } // for
	 return flag;
    } // isPrime
} // Prime
