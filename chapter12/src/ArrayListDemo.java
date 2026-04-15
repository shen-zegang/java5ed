void main() {
    List<String> bigCities = new ArrayList<>();
    bigCities.add("北京");
    bigCities.add("上海");
    bigCities.add("广州");

//    for (int i = 0; i < bigCities.size() ; i++) {
//        IO.println(bigCities.get(i));
//    }

//    for (String city: bigCities) {
//        IO.println(city);
//    }

//    Iterator iterator = bigCities.iterator();   // 得到迭代器对象
//    while (iterator.hasNext()){
//        IO.println(iterator.next());
//    }

         for(Iterator iterator = bigCities.iterator();iterator.hasNext();){
        IO.println(iterator.next());
    }

}