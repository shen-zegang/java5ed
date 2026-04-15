import com.boda.utils.Date;
void main() {
        Date today = new Date();
        Date birthday = new Date(2002,10,20);

        System.out.println(today.toString());
        System.out.println(birthday.toString());

        if(birthday.isLeapYear()){
           System.out.println(birthday.getYear() + "年是闰年");
        }else{
           System.out.println(birthday.getYear() + "年不是闰年");
        }
       System.out.println("我已出生"+birthday.between(today)+"天。");

}
