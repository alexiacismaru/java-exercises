package com.example.calculator;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;

import java.util.*;

public class CalculatorPane extends GridPane {
    private final static int CTRL_MIN_SIZE=35;
    private final static int CTRL_MAX_SIZE=2000;
    private final static int SPACING=10;

    private final Map<OperandCharacter,Button> operandButtons = new HashMap<>();
    private final Map<Operator,Button> operatorButtons = new HashMap<>();
    private Button clearButton;
    private Button equalsButton;
    private TextField display;

    Map<OperandCharacter, Button> getOperandButtons() {
        return operandButtons;
    }//getter

    Map<Operator, Button> getOperatorButtons() {
        return operatorButtons;
    }//getter

    Button getClearButton() {
        return clearButton;
    }//getter

    Button getEqualsButton() {
        return equalsButton;
    }//getter

    TextField getDisplay() {
        return display;
    }//getter

    public CalculatorPane() {
        initializeNodes();
        layoutNodes();
    }//constructor

    private void layoutNodes() {
        add(display,0,0,5,1);
        add(operandButtons.get(OperandCharacter.SEVEN),0,1);
        add(operandButtons.get(OperandCharacter.EIGHT),1,1);
        add(operandButtons.get(OperandCharacter.NINE),2,1);
        add(operandButtons.get(OperandCharacter.FOUR),0,2);
        add(operandButtons.get(OperandCharacter.FIVE),1,2);
        add(operandButtons.get(OperandCharacter.SIX),2,2);
        add(operandButtons.get(OperandCharacter.ONE),0,3);
        add(operandButtons.get(OperandCharacter.TWO),1,3);
        add(operandButtons.get(OperandCharacter.THREE),2,3);
        add(operandButtons.get(OperandCharacter.ZERO),0,4);
        add(operandButtons.get(OperandCharacter.DECIMAL_SEPARATOR),1,4,2,1);
        add(operatorButtons.get(Operator.DIVIDE),3,1);
        add(operatorButtons.get(Operator.MULTIPLY),3,2);
        add(operatorButtons.get(Operator.MINUS),3,3);
        add(operatorButtons.get(Operator.PLUS),3,4);
        add(clearButton,4,1);
        add(equalsButton,4,2,1,3);
        setCommonConstraints();
        //setGridLinesVisible(true);
    }
    //Each control should be placed at the correct cell within the GridPane. Some controls occupy more than one row or column.
    //Each control has a minimum size of 35 by 35 pixels.
    //Each control has a maximum size of Double.MAX_VALUE by Double.MAX_VALUE pixels. This will make the controls grow up to their cell's size.
    //Add some padding inside each of the cells. This is done at the GridPane level.
    //Add some gaps between the cells, both horizontally and vertically. This is also done at the GridPane level.

    private void setCommonConstraints() {
        for ( Node node:getChildren()){
            Region child = (Region)node;
            child.setMinSize(CTRL_MIN_SIZE,CTRL_MIN_SIZE);
            child.setMaxSize(CTRL_MAX_SIZE,CTRL_MAX_SIZE);
        }
        setPadding(new Insets(SPACING));
        setVgap(SPACING);
        setHgap(SPACING);
    }

    private void initializeNodes() {
        for(OperandCharacter symbol:OperandCharacter.values()){
            operandButtons.put(symbol, new Button(String.valueOf(symbol.getChar())));
        }//get the values from OperandCharacter class
        for(Operator symbol:Operator.values()){
            operatorButtons.put(symbol, new Button(String.valueOf(symbol.getChar())));
        }//get the values from Operator class
        equalsButton = new Button("=");//initialise
        clearButton=new Button("C");//initialise
        display = new TextField();//initialise
        display.setEditable(false);//text field's content can not be modified by the user
    }
}
