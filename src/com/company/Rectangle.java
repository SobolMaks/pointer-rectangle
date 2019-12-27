package com.company;

public class Rectangle {


    public double width = 7;
    public double length = 3;

        public Rectangle(double width, double length) {
            this.width=7;
            this.length=3;
            System.out.println("Rectangle створено");
        }

    public Rectangle() {

    }

    public void info (){
            System.out.println("прямокутник: ширина = "+width+", довжина = "+length);
            System.out.println("Площа прямокутника: "+width*length);
            System.out.println("Периметр прямокутника: "+(width+length)*2);
        }


    }


