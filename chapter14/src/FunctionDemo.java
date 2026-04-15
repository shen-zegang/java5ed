void main() {
      // f = c * (9.0 / 5) + 32
      Function<Double, Double> fun = c -> c * (9.0 / 5 ) + 32;

      double degree = 37.0;
      System.out.printf("%4.2f%n",fun.apply(degree));

}

