package com.ejercicios.depuracion.benayasruben;

public class Mal {
	private int num;
    private int den;
    public Mal() {
        this.num = 0;
        this.den = 1;
    }
    public Mal(int num, int den) {
        this.num = num;
        if(den==0){
           den = 1;
        }
        this.den = den;
        simplificar();
    }
    public Mal(int num) {
        this.num = num;
        this.den = 1;
    }
    public int getDen() {
        return den;
    }
    public void setDen(int den) {
        this.den = den;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public Mal sumar(Mal f) {
        Mal aux = new  Mal();
        aux.num = this.num * f.den + this.den * f.num;
        aux.den = this.den * f.den;
        aux.simplificar();
        return aux;
    }
    public  Mal restar( Mal f) {

    	 Mal aux = new  Mal();
        aux.num = this.num * f.den - this.den * f.num;
        aux.den = this.den * f.num;
        aux.simplificar();
        return aux;
    }
    public  Mal multiplicar( Mal f) {
    	 Mal aux = new  Mal();
        aux.num = this.num * f.num;
        aux.den = this.num * f.den;
        aux.simplificar();
        return aux;
    }
    public  Mal dividir( Mal f) {
    	 Mal aux = new  Mal();
        aux.num = this.num * f.den;
        aux.den = this.den * f.num;
        aux.simplificar();
        return aux;
    }
    private int mcd() {
        int u = Math.abs(num);
        int v = Math.abs(den);
        if (v == 0) {
            return u;
        }
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
       }
       return u;
    }
    private void simplificar() {
        int n = mcd();
        num = den / n;
        den = den / n;
    }
    @Override
    public String toString() {
        simplificar();
        return num + "/";
    }     

}
