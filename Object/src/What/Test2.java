package What;

class Shape2{
    private void draw(){
        System.out.println("Draw Shape");
    }

    void show(){
        draw();
    }
}

class Circle2 extends Shape2{
    void draw(){
        System.out.println("Draw Circle");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Shape2 s = new Circle2();
        s.show();
    }
}
