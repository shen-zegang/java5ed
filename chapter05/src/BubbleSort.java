public void bubbleSort(int[] a){
    for(var i = 0; i < a.length-1; i++) {
	   for(var j = 0; j < a.length -i -1; j ++) {
		   if(a[j] > a[j+1]) {
		       int t = a[j];
		       a [j] = a[j+1];
		       a[j+1] = t;
		   }
	   }
	   IO.print("第" + (i+1) + "趟结果：");
		for(var n:a) {
		     IO.print(" " + n);
		}
	   IO.println();
	}
}

void main() {
	int[]nums = {75, 53, 32, 12, 46, 199, 17,  54};
	//int[]nums = {199,75,  54,53, 46,32, 17,  12  };
	IO.print("初始元素：");
	for(var n:nums) {
		IO.print(" " + n);
	}
	IO.println();
	bubbleSort(nums);
}


