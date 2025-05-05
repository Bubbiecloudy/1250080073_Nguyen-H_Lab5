package Lab5;

import java.util.Scanner;

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class Bai04_MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public Bai04_MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap x: ");
        x = scanner.nextInt();
        System.out.print("Nhap y: ");
        y = scanner.nextInt();
        System.out.print("Nhap xSpeed: ");
        xSpeed = scanner.nextInt();
        System.out.print("Nhap ySpeed: ");
        ySpeed = scanner.nextInt();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + "), speed=(" + xSpeed + ", " + ySpeed + ")";
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }
}

class Bai04_MovableCircle implements Movable {
    private int radius;
    private Bai04_MovablePoint center;

    public Bai04_MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new Bai04_MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void nhap() {
        System.out.println("Nhap thong tin tam hinh tron:");
        center = new Bai04_MovablePoint(0, 0, 0, 0);
        center.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        radius = scanner.nextInt();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Bai04_MovablePoint getCenter() {
        return center;
    }

    public void setCenter(Bai04_MovablePoint center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return "Hinh tron tai " + center.toString() + ", ban kinh=" + radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}

public class Bai04 {
    public static void main(String[] args) {
        System.out.println("Nhap thong tin hinh tron:");
        Bai04_MovableCircle circle = new Bai04_MovableCircle(0, 0, 0, 0, 0);
        circle.nhap();

        System.out.println("Vi tri ban dau: " + circle.toString());

        circle.moveUp();
        System.out.println("Sau khi di chuyen len: " + circle.toString());

        circle.moveDown();
        System.out.println("Sau khi di chuyen xuong: " + circle.toString());

        circle.moveLeft();
        System.out.println("Sau khi di chuyen trai: " + circle.toString());

        circle.moveRight();
        System.out.println("Sau khi di chuyen phai: " + circle.toString());
    }
}

