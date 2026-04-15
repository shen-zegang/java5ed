void main() {
	   String[] country={"中国","印度","澳大利亚",
               "德国","古巴","希腊","日本"};
	   String[] capital={"Beijing","New Delhi","Canberra","Berlin",
                  "Havana","Athens","Tokyo"};
	   Map<String, String> m = new TreeMap<>();
	   for(int i = 0;i<country.length;i++){
	        m.put(country[i], capital[i]);
	   }
	   IO.println("共有 " + m.size() + " 个国家:");
	   IO.println(m);

	   IO.println(m.get("中国"));   // Beijing
	   m.remove("日本");
	   Set<String> coun = m.keySet();
	   for(Object c : coun)
	       IO.print(c + " ");
}
