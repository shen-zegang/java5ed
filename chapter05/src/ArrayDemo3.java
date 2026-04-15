public static double sumArray(double array[]){
    var sum = 0.0;
    for(var i = 0; i < array.length; i++){
        sum = sum + array[i];
    }
    return sum;
}

public static int[] reverse(int[] list){
    var result = new int[list.length];  // 创建一与参数数组大小相同的数组
    for(int i = 0, j = result.length-1; i < list.length; i++ , j--){
        result[j] = list[i];   // 实现元素反转
    }
    return result;  // 返回数组
}

public int linearSearch(int[] array, int key){
    for (var i = 0; i < array.length ; i++){
        if( array[i]==key)
            return i;
    }
    return -1;
}

public int binarySearch(int[] array, int key){
    int low = 0;
    int high = array.length-1;
    while (high >= low){
        int mid = (low + high) / 2;
        if(key < array[mid])
            high = mid -1;
        else if(key == array[mid])
            return mid;
        else
            low = mid + 1;
    }
    return -low - 1;
}
public void bubbleSort(int[] a){
    for(var i = 0; i < a.length; i++) {
        for(var j = 0; j < a.length -i -1; j ++) {
            if(a[j] > a[j+1]) {
                int t = a[j];
                a [j] = a[j+1];
                a[j+1] = t;
            }
        }
        IO.print("第 " + (i+1) + "趟结果：");
        for(var n:a) {
            IO.print(" " + n);
        }
        IO.println();
    }
}

void main() {
    var marks = new double[]{79, 84.5, 63,90, 98};
    IO.println(sumArray(marks));

//    int[] list = {6, 7, 8, 9, 10};
//    int[] list2 = reverse(list);

}