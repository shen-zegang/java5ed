void main() {
    int[] rand = new int[6];
    for (int i = 0; i < 600; i++) {
        int r = (int) (Math.random() * 6) + 1;
        switch (r) {
            case 1 -> {
                rand[0]++;
            }
            case 2 -> rand[1]++;
            case 3 -> rand[2]++;
            case 4 -> rand[3]++;
            case 5 -> rand[4]++;
            case 6 -> rand[5]++;
        }
    }
    for (int i = 0; i < rand.length; i++)
        IO.println("rand[" + i + "]=" + rand[i]);
}
