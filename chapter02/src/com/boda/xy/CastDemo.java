void main() {
    IO.println(Math.PI);   // 输出PI
    double pi = Math.PI;
    pi = pi * 10000 + 0.5;        // 将原值扩大1000倍，再加0.5
    pi = (int) pi;                  // 强制转换成整数
    pi = pi / 10000;               // 再除以10000，达到四舍五入效果
    IO.println(pi);
}

