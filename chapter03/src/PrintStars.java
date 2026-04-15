void main() {
	for (int n = 1; n <= 8; n++) {
		for (int k = 1; k <= (8 - n); k++) {
			 IO.print(" ");
		}
		for(int j=1; j<=(2*n-1);j++) {
		   	IO.print("*");
		}
		IO.println();      // 换行
    }
}

