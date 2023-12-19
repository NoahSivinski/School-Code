public class ArrayPacket {
    public static void main (String[] args) {
	char [] input = {0x00, 0x05, 0x68, 0x65, 0x6c, 0x6c, 0x6f, 0xe6, 0x01, 0x06, 0x77, 0x6f, 0x72, 0x6c, 0x64, 0x21, 0xaf};
	int ID = input[0]; // convert char to int
	int length = input[1];
	int [] data = new int[length];
	for (int i = 0; i < length; i++) {
	    data[i] = input[i + 2];
	} // for
	int checkSum = input[length + 2];
	
	int sum = ID + length;
	for  (int i = 0; i < length; i++) {
	    sum += data[i];
	} // for
	sum = (~sum) & 0xFF;
	if (sum == checkSum) {
	    System.out.println("Valid package.");
	} else {
	    System.out.println("Invalid package.");
	} // if-else
    } // main
} // ArrayPacket
