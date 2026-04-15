void main() {
	   // BiFunction   R apply(T,U)
	   BiFunction<Double,Double,Double> fun = (width,length)-> width * length;

	   double width = 8.0;
	   double length = 10.0;
	   double area = fun.apply(width, length);
	   System.out.printf("%4.2f%n",area);
}