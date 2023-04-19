abstract class Shape {
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing Rectanle!");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle!");
    }
}
class Test{
    public static void main(String[] args) {
        Shape s = new Rectangle();
        Shape s1 = new Circle();

        s.draw();
        s1.draw();
    }
}