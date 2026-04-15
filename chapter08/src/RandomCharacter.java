public char getLetter(){
    return (char)(97 + Math.random() * (26));
}
void main () {
      for(int i = 1 ;i <= 100 ; i ++){
         IO.print(getLetter()+" ");
     	   if( i % 20 ==0)    // 每输出20个字母换行
     	     IO.println();
      }
}
