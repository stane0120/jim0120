package kr.ac.kopo.practice8;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return String.format("가로 %d, 세로 %d일 때 직사각형의 넓이는 %.2f이다.", width, height, calculateArea());
    }
}
