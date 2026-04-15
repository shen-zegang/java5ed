void main() {
    int comp = (int) (Math.random() * 3);
    int your;
    Scanner input = new Scanner(System.in);
    IO.print("你出什么？（石头（2）、剪刀（1）、布（0））：");
    your = input.nextInt();
    IO.print("计算机出的是：" + ((comp == 2) ? "石头" : ((comp == 1) ? "剪刀" : "布")));
    IO.print(",你出" + ((your == 2) ? "石头" : ((your == 1) ? "剪刀" : "布")));
    if (comp == your) {
        IO.print(",平局");
    } else if ((your - comp == 1 || your - comp == -2)) {
        IO.print(",你赢了");
    } else {
        IO.print(",你输了");
    }
}


