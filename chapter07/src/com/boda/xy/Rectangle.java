package com.boda.xy;

public class Rectangle extends Shape{
    protected double length;
    protected double width;
    public Rectangle(){
       this(0,0);
    }
    public Rectangle(double length,double width){
       super("����");                  // ���ø���Ĺ��췽��
       this.length = length;
       this.width = width;
    }
   
    public void setLength(double length) {
		this.length = length;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
    public double getPerimeter(){    // ʵ�ָ���ĳ��󷽷�
        return 2 * (length + width);
    }
    @Override
    public double getArea(){          // ʵ�ָ���ĳ��󷽷�
        return length * width;
    }
    @Override
    public String toString(){        // ����Object���toString()����
      return "[����] length = "+ length +", width=" + width;
    }
}
