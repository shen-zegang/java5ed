void main() {
    var cities = new ArrayList<String>();
    cities.add("北京");
    cities.add("上海");
    cities.add("广州");
    IO.println(cities.size());
    cities.add(1,"伦敦");
    cities.set(1,"纽约");
    IO.println(cities.contains("北京"));
    IO.println(cities);
    IO.println(cities.indexOf("巴黎"));

}