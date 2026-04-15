void main() {
    Supplier<Integer> randomNumber = () ->(int) (Math.random()*10);

    for (int i = 0; i < 5; i++) {
        IO.println(randomNumber.get());
    }

}

