package com.example.background;

import java.util.Random;

public class BackgroundModel {

    private String background="cornsilk";//new String attribute
    private int COLOR_MAX=256;//max colour code


    private final Random random = new Random();//new Random

    public String getBackground() {
        return background;
    }//getter


    public void  setRandomColor(){
        background =String.format("rgb(%d,%d,%d)",random.nextInt(COLOR_MAX), random.nextInt(COLOR_MAX), random.nextInt(COLOR_MAX));
    }//setter (colour code, 3 random numbers that represent the rgb code)
}
