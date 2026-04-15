package com.boda.xy;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;
public class User {
	// 定义一个绑定属性
	private StringProperty username = new SimpleStringProperty();
	// 值获取方法
	public final String getUsername() {
	   return username.get();
	} 
	// 值设置方法
	public final void setUsername(String newValue) {
	   username.set(newValue);
	}
	// 属性获取方法
	public final StringProperty usernameProperty(){
	    return username;
	} 
}
