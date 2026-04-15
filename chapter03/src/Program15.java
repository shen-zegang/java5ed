void main() {
    int legs = 100;
    int heads = 40;
    int chick, hare;
    for (chick = 0; chick <= 50; chick++) {
        for (hare = 0; hare <= 25; hare++) {
            if ((chick + hare) == heads && (chick * 2 + hare * 4) == legs)
                IO.println("chick=" + chick + " ,hare=" + hare);
        }
    }
}

