package What;

class Shape{
    void draw(){
        System.out.println("Draw Shape");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("Draw Circle");
    }
}

class Triangle extends Shape{
    void draw(){
        System.out.println("Draw Triangle");
    }
}

class Square extends Shape{
    void draw(){
        System.out.println("Draw Square");
    }
}

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Triangle(), new Square()};
        for(Shape s : shapes){
            s.draw();
        }
    }
}
