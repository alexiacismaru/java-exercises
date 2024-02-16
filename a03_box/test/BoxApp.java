package be.kdg.java1.assignments.a03_box.test;

import be.kdg.java1.assignments.a03_box.storage.Box;

public class BoxApp {
    
    public static void main(String[] args) {
        Box cube = new Box("Cube", 10);
        System.out.println(cube);

        Box flat = new Box("Flat box", 30, 30, 3.5);
        System.out.println(flat);

        Box parcel = new Box("Parcel Service box", 30.5, 21.5, 17.0);
        System.out.println(parcel);
    }  // main()
    
}  // class
