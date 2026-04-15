void main() {
    int[] numbers = {5, 2, 8, 4, 9, 1, 12, -33};
    System.out.println("排序之前：");
    for (int num : numbers) {
        IO.print(num + " ");
    }
    //选择排序
    for (int i = 0; i < numbers.length - 1; i++) {// 做第i趟排序
        int k = i;
        for (int j = k + 1; j < numbers.length; j++) {// 选最小的记录
            if (numbers[j] < numbers[k]) {
                k = j; //记下目前找到的最小值所在的位置
            }
        }
        //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
        if (i != k) {  //交换a[i]和a[k]
            int temp = numbers[i];
            numbers[i] = numbers[k];
            numbers[k] = temp;
        }
    }
    IO.println();
    IO.println("排序后：");
    for (int num : numbers) {
        IO.print(num + " ");
    }
}

