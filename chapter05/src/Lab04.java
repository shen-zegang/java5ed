void main() {
    double[][] sales = {
            {80, 75, 78, 93, 20},
            {67, 87, 98, 65, 33},
            {86, 72, 60, 76, 18},
            {76, 80, 76, 63, 24}
    };
    // (1) 统计该商场所有商品销售总额。
    double totalAmount = 0.0;
    for (int i = 0; i < sales.length; i++) {
        for (int j = 0; j < sales[0].length; j++) {
            totalAmount = totalAmount + sales[i][j];
        }
    }
    IO.println("总销售额：" + totalAmount);
    //(2) 计算并输出每个季度所有商品销售总额。
    for (int i = 0; i < sales.length; i++) {
        double season = 0.0;
        for (int j = 0; j < sales[0].length; j++) {
            season = season + sales[i][j];
        }
        IO.println("第" + (i + 1) + "季度销售额：" + season);
    }
    //(3) 计算并输出每种商品的销售总额，及销售额最大的商品。
    double max = 0;
    for (int j = 0; j < sales[0].length; j++) {
        double product = 0.0;
        for (int i = 0; i < sales.length; i++) {
            product = product + sales[i][j];
        }
        if (product > max) {
            max = product;
        }
        IO.println("第" + (j + 1) + "件商品销售额：" + product);
    }
    IO.println("最大销售额：" + max);
}

