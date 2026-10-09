package Jobsheet6.Percobaan2;

public class ClassA {
    private int x;
    private int y;

    public void setx(int x) {
        this.x = x;
    }

    public void sety(int y) {
        this.y = y;
    }

    public void getNilai() {
        System.out.println("Nilai x: " + x);
        System.out.println("Nilai y: " + y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
