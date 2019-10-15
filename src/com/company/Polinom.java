package com.company;
public class Polinom extends SetOfFraction{

    public Polinom(SetOfFraction sent)
    {
        for (int i=0; i<sent.fractions.size(); i++){
            fractions.add(sent.fractions.get(i));
        }
    }

    public void AddPolinom(Polinom sent){
        int MinSize;
        MinSize = fractions.size() > sent.fractions.size() ? sent.fractions.size() : fractions.size();
        for (int i = 0; i < MinSize; i++){
            fractions.get(i).addition(sent.fractions.get(i));
        }

    }

}