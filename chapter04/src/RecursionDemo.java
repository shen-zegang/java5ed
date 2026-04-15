public long factor(int n){
    if(n == 0)
       return 1 ;
    else
       return n * factor(n-1);
 }

void main(){
       int k = 21 ;
       IO.println(k+"!="+factor(k));
       IO.println("Long.MAX_VALUE = "  + Long.MAX_VALUE);	// long型数的最大值
}
