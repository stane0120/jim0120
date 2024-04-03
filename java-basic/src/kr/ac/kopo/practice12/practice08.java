package kr.ac.kopo.practice12;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class practice08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(generatePoints(n));
    }
    

    public static int generatePoints(int n) {

        Set<Point> points = new HashSet<>();
        points.add(new Point(0, 0));


        for (int i = 0; i < n; i++) {
            Set<Point> newPoints = new HashSet<>();


            for (Point point : points) {
                int x = point.getX();
                int y = point.getY();
                newPoints.add(new Point(x - 1, y - 1));
                newPoints.add(new Point(x - 1, y));
                newPoints.add(new Point(x - 1, y + 1));
                newPoints.add(new Point(x, y - 1));
                newPoints.add(new Point(x, y));
                newPoints.add(new Point(x, y + 1));
                newPoints.add(new Point(x + 1, y - 1));
                newPoints.add(new Point(x + 1, y));
                newPoints.add(new Point(x + 1, y + 1));
            }


            points.addAll(newPoints);
        }


        return points.size();
    }

 
    static class Point {
        private final int x;
        private final int y;


        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }


        public int getX() {
            return x;
        }


        public int getY() {
            return y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }


        @Override
        public int hashCode() {
            return 31 * x + y;
        }
    }
}