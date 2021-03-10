package com.ttn.bootcamp.ques1;

public class Polygon {

    private Circle circle;

    public Polygon() {

    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    /*
     * this method calculate the area of given polygon
     * @param number main input for calculating area
     * @return area of the specified polygon
     */
    public double calculate(double number) {
//       tight coupling
        double area = circle.getArea(number);
        return area;
    }
}
