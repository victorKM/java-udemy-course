package entities;

import services.Shape;

public class Circle implements Shape{
  
  private Double radius;

  public Circle(){
  }

  public Circle(Double radius) {
    super();
    this.radius = radius;
  }

  public Double getRadius() {
    return radius;
  }

  public void setRadius(Double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI*radius*radius;
  }
  
}
