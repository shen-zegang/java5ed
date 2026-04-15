public boolean isPalindrome(String s){
     int low = 0;
     int high = s.length() -1;
     while(low < high){
       if(s.charAt(low) != s.charAt(high))
         return false;
  	    low ++;
  	    high --;
  	  }
  	  return true;
}
void main(){
      Scanner sc = new Scanner(System.in);
      IO.print("请输入一个字符串：");
      String s = sc.nextLine();
      if(isPalindrome(s))
         IO.println(s+"：是回文。");
      else
         IO.println(s+"：不是回文。");
}
