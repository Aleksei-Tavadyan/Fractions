package com.company;
public class Main {

    public static void main(String[] args) {


        SetOfFraction first=new SetOfFraction();
        first.AddFraction(new Fraction(7, 2));
        first.AddFraction(new Fraction(1, 3));
        first.AddFraction(new Fraction(5, 8));

       first.PrintSet();
        first.PrintMax();
/*
        SetOfFraction second=new SetOfFraction();
        second.AddFraction(new Fraction(1, 2));
        second.AddFraction(new Fraction(1, 3));
        second.AddFraction(new Fraction(1, 4));

        Polinom poli = new Polinom(first);
        Polinom poli2 = new Polinom(second);
        poli.AddPolinom(poli2);
        poli.PrintSet();
        poli2.PrintSet();

        SetOfFraction third = new SetOfFraction();
        third.ReadFile("D:\\Users\\itp2390\\IdeaProjects\\koji\\bla.txt");
        third.PrintSet();
    */}
}