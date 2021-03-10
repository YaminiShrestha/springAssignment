package com.ttn.bootcamp.ques2;


public class Polygon {
    // Reference of an interface
    private IPolygon iPolygon;

    public IPolygon getiPolygon() {
        return iPolygon;
    }

    public void setiPolygon(IPolygon iPolygon) {
        this.iPolygon = iPolygon;
    }


    public void shape() {
        iPolygon.getShape();
    }


}
