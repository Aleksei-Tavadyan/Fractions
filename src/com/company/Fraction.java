package com.company;

import org.junit.Test;

public  class Fraction implements Cloneable{

    private int Top;
    private int Bottom;

    public Fraction(int top, int bottom){
        this.Top = top;
        this.Bottom = bottom;
    }

    public void addition(Fraction sent){
        this.Top = this.Top * sent.Bottom + sent.Top * this.Bottom;
        this.Bottom *= sent.Bottom;
    }

    public int getTop()
    {
        return Top;
    };
    ;
    public int getBottom(){
        return Bottom;
    }
    public void setTop(int top){
        this.Top = top;
    }
    public void setBottom(int bottom){
        this.Bottom = bottom;
    }
    public double Value(){
        return (double) Top / Bottom;
    }
    public Fraction clone() throws CloneNotSupportedException{

        return (Fraction) super.clone();
    }
}
