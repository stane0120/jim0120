package kr.ac.kopo.practice8;

import java.util.Random;
import java.util.Scanner;

public class Figure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();

        System.out.println("도형을 선택하여 그에 맞는 넓이를 구합니다.");
        System.out.println("1. 삼각형, 2. 정사각형, 3. 직사각형, 4. 원");
        System.out.print("도형을 선택하세요: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                int base = ra.nextInt(10) + 1;
                int height = ra.nextInt(10) + 1;
                Triangle triangle = new Triangle(base, height);
                System.out.println(triangle);
                break;
            case 2:
                int width = ra.nextInt(10) + 1;
                Square square = new Square(width);
                System.out.println(square);
                break;
            case 3:
                int rectWidth = ra.nextInt(10) + 1;
                int rectHeight = ra.nextInt(10) + 1;
                Rectangle rectangle = new Rectangle(rectWidth, rectHeight);
                System.out.println(rectangle);
                break;
            case 4:
                int radius = ra.nextInt(10) + 1;
                Circle circle = new Circle(radius);
                System.out.println(circle);
                break;
            default:
                System.out.println("올바른 선택이 아닙니다.");
        }
    }
}