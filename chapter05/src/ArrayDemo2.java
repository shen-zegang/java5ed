import com.boda.xy.Employee;

void main() {
    var marks = new double[]{79, 84.5, 63,90, 98};
    var staffs = new Employee[]{
            new Employee("张三", 28, 800),
            new Employee("王五", 30, 8500),
            new Employee("李四", 26, 6000),
    };


        for(var i = 0; i < staffs.length; i ++){
            System.out.println(staffs[i].getName());     // 换行
        }
}
