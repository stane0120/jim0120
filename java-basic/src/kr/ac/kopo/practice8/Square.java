package kr.ac.kopo.practice8;

public class Square extends Shape{
	   private int width;

	    public Square(int width) {
	        this.width = width;
	    }

	    double calculateArea() {
	        return width * width;
	    }

	    @Override
	    public String toString() {
	        return String.format("너비가 %d인 정사각형의 넓이는 %.2f이다.", width, calculateArea());
	    }
	}
