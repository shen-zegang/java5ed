package com.boda.xy;

public class Fraction {
    private int numer;
    private int denom;
    public Fraction() {
        this.numer = 0;
        this.denom = 1;
    }
    public Fraction(int numer) {
        this.numer = numer;
        this.denom = 1;
    }
    public Fraction (int numer, int denom) {
        if (denom == 0) {
            throw new IllegalArgumentException("分数分母不能为0！");
        }
        this.numer = numer;
        this.denom = denom;
        normalize();
    }
    public int getNumer() {
        return numer;
    }
    public int getDenom() {
        return denom;
    }
    public Fraction add(Fraction fr) {
        int newNumer = this.numer * fr.denom + fr.numer * this.denom;
        int newDenom = this.denom * fr.denom;
        return new Fraction(newNumer, newDenom);
    }
    public Fraction subtract(Fraction fr) {
        int newNumer = this.numer * fr.denom - fr.numer * this.denom;
        int newDenom = this.denom * fr.denom;
        return new Fraction(newNumer, newDenom);
    }
    public Fraction multiply(Fraction fr) {
        int newNumer = this.numer * fr.numer;
        int newDenom = this.denom * fr.denom;
        return new Fraction(newNumer, newDenom);
    }
    public Fraction divide(Fraction fr) {
        if (fr.numer == 0) {
            throw new ArithmeticException("不能被0除！");
        }
        int newNumer = this.numer * fr.denom;
        int newDenom = this.denom * fr.numer;
        return new Fraction(newNumer, newDenom);
    }
    private int gcd(int n, int m) {
        if (m == 0)
            return n;
        return gcd(m, n % m);
    }
    private void normalize() {
        if(denom==0){
            throw new RuntimeException("分数分母不能为0！");
        }
// 改变分子的正负号
        if(denom < 0){
            denom = -denom;
            numer = - numer;
        }
// 使用最大公约数整除分子和分母
        int divisor = gcd(Math.abs(numer),Math.abs(denom));
        numer = numer / divisor;
        denom = denom / divisor;
    }

    @Override
    public String toString() {
        String s = "";
        if (denom == 1 || numer == 0){
            return s + numer;
        }else{
            return s + numer + "/" + denom;
        }
    }
}

