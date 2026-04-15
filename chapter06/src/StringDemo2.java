void main() {
    var s = "Java is cool";
    IO.println(s.length());             // 输出：12
    IO.println(s.substring(5,7));      // 输出：is
    IO.println(s.substring(8));        // 输出：cool
    IO.println(s.toUpperCase());       // 输出：JAVA IS COOL
    IO.println(s.toLowerCase());       // 输出：java is cool
    var s1 = "编写一次，";
    var s2 = "到处运行。";
    s1 = s1.concat(s2);
    IO.println(s1);                     // 输出：编写一次，到处运行。
    IO.println(s.replace('a','A'));  // 输出：JAvA is cool
    IO.println(s.isEmpty());           // 输出：false

}