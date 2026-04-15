import static java.lang.Math.*;
import static java.lang.IO.*;
void main() {
	println("sqrt(2) = " + sqrt(2));
	println("pow(2,5) = " + pow(2, 5));
	println("rint(2.5) = " + rint(2.5));
	println("rint(-3.5) = " + rint(-3.5));
	println("round(3.5) = " + round(3.5));
	println("round(-3.5) = " +round(-3.5));
	double pi =PI;
	pi = round(pi * 10000) / 10000.0; // 四舍五入到小数点后4位
	println("PI = " + pi);
}
