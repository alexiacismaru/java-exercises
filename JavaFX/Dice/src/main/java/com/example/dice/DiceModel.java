package com.example.dice;


import java.util.Random;

public class DiceModel {
    public static final int MAX_PIPS = 6;//set a max for the random

    private int numberOfPips1;//number for a die
    private int numberOfPips2;//number for a die
    private Random random;//new random

    public DiceModel() {
        this.numberOfPips1 = 1;
        this.numberOfPips2 = 1;
        this.random = new Random();
    }//constructor

    public void roll(){
        numberOfPips1 = random.nextInt(MAX_PIPS) + 1;
        numberOfPips2 = random.nextInt(MAX_PIPS) + 1;
    }//ints are equal to a random number from 1 -> 6 (both included)

    public int getNumberofPips1() {
        return numberOfPips1;
    }//getter

    public int getNumberOfPips2() {
        return numberOfPips2;
    }//getter
}
