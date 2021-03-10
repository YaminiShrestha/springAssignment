package com.ttn.bootcamp.ques1;

public class Circle {
    private double radius;

    public Circle() {
        super();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    /*
     * This method get the area of circle
     * @param radius main input of the radius of circle
     * @return the area of circle
     */
    public double getArea(double radius) {
        System.out.println("Circle getArea executed");
        return 3.14 * radius * radius;
    }
}
