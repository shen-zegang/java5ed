public double getAverage(List<? extends Number> numberList){
	    double total = 0.0;
	    for(Number number :numberList){
		    total += number.doubleValue();
	    }
	    return total/numberList.size();
   }
   
   void main() {
	    List<Integer> integerList = new ArrayList<Integer>();
	    integerList.add(3);
	    integerList.add(30);
	    integerList.add(300);
	    System.out.println(getAverage(integerList));  // 111.0
	    
	    List<Double> doubleList = new ArrayList<>();
	    doubleList.add(5.5);
	    doubleList.add(55.5);
	    System.out.println(getAverage(doubleList));  // 30.5
}

