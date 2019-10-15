package com.company;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class SetOfFraction {
    protected ArrayList<Fraction> fractions;
    private boolean cashAddition;
    private Fraction MaxValue;
    private Fraction MinValue;
    private int cashNumber;
    private int cashHowMany;

    public SetOfFraction()
    {
        fractions = new ArrayList<Fraction>();
        cashAddition = false;
    }

    public void AddFraction(Fraction n){
        fractions.add(n);
        cashAddition = false;
    }

    public Fraction getMax() throws Exception {
        if(cashAddition) return MaxValue.clone();
        if(fractions.size() == 0) throw new Exception();
        MaxValue = fractions.get(0).clone();
        for(int i = 0; i< fractions.size(); i++){
            if(MaxValue.Value()< fractions.get(i).Value()) MaxValue= fractions.get(i).clone();
        }
        cashAddition = true;
        return MaxValue.clone();
    }
    public Fraction getMin() throws Exception {
        if(cashAddition) return MinValue.clone();
        if(fractions.size()==0) throw new Exception();
        MinValue= fractions.get(0).clone();
        for(int i = 0; i< fractions.size(); i++){
            if(MinValue.Value()< fractions.get(i).Value()) MinValue= fractions.get(i).clone();
        }
        cashAddition =true;
        return MinValue.clone();
    }

    public void PrintSet(){
        System.out.println("|--------|");
        for(int i = 0; i < fractions.size(); i++){
            System.out.println(i);
            System.out.println(fractions.get(i).getTop() + "/" + fractions.get(i).getBottom());
        }
        System.out.println("|--------|");
    }

    public void PrintMax(){
        try{
            System.out.print("Max is: " + this.getMax().getTop());
            System.out.print(" ");
            System.out.println(this.getMax().getBottom());
        }
        catch (Exception pop){
            System.out.println("caught");
        }
    }

    public void PrintMin(){
        try{
            System.out.println("Min is: " + this.getMin().getTop() + " " + this.getMax().getBottom());
        }
        catch (Exception pop){
            System.out.println("caught");
        }
    }

    public int FindMoreThan(int number){
        if (number == cashNumber){
            return cashHowMany;
        }
        return 0;
    }

    public void ReadFile(String FileName) {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(FileName));
            String m, n;
            while ((m = reader.readLine()) != null) {
                n = reader.readLine();
                fractions.add(new Fraction(Integer.parseInt(m), Integer.parseInt(n)));
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

    }

}