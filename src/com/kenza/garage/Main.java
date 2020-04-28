package com.kenza.garage;

import com.sun.tools.javac.util.List;

public class Main {
    public static void main(String[] args) {

Car car =new Car("Clio","Renault clio3 ","Renualt",2013,"rouge",1200,new int[]{123,345,567},456,20,100,"",List.from(new String[]{"","",""}));
    car.start();
    }
}
