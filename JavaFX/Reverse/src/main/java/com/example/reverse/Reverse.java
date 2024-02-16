package com.example.reverse;

/**
 * The model consists of multiple classes referring to the domain concepts
 * This class represents the main business concept handled in a scene
 * It may have attributes referring to other concepts
 */
public class Reverse {

    private String text;//new String attribute

    public Reverse(String text) {
        this.text = text;
    }//constructor

    public String getText() {
        return text;
    }//getter

    public void setText(String text) {
        this.text = text;
    }//setter

    public void reverse() {
        StringBuilder text = new StringBuilder();
        text.reverse();
    }//reverse() method that makes the previous String -> StringBuilder so that we can use the reverse reference to reverse the contents of the StringBuilder
}

