package com.boda.xy;

public sealed abstract class Shape permits Rectangle {
    public abstract double area();
    // 类的实现
}
