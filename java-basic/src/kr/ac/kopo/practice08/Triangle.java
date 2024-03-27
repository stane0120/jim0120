package kr.ac.kopo.practice08;

public class Triangle extends Shape{
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return base * height / 2.0;
    }

    @Override
    public String toString() {
        return String.format("밑변 %d, 높이 %d일 때 삼각형의 넓이는 %.2f이다.", base, height, calculateArea());
    }
}
