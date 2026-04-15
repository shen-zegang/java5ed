void main() {
    int[] cards = new int[52];
    for (int i = 0; i < 52; i++) {
        cards[i] = i;
    }
    int sum = 0, count = 0;
    while (sum != 24) {
        // 打乱牌的次序
        for (int i = 0; i < cards.length; i++) {
            // 随机产生一个元素下标0~51
            int index = (int) (Math.random() * cards.length);
            int temp = cards[i]; // 将当前元素与产生的元素交换
            cards[i] = cards[index];
            cards[index] = temp;
        }
        // 取4张牌
        sum = 0;
        for (int i = 0; i < 4; i++) {
            sum = sum + cards[i] % 13 + 1;
        }
        count++;
    }
    IO.println(sum);
    IO.println(count);
}

