package kr.ac.kopo.practice8;

public class Circle extends Shape{
    private int radius;
    private final double PI = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return radius * radius * PI;
    }

    @Override
    public String toString() {
        return String.format("반지름이 %d일 때 원의 넓이는 %.2f이다.", radius, calculateArea());
    }
}