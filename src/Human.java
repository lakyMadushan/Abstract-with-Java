abstract class Human {
    abstract void eat();
    abstract void walk();
    void breathing(){
        System.out.println("Breathing!");
    }
}

class Man extends Human{
    void eat(){
        System.out.println("Anything Eat!");
    }
    void walk(){
        System.out.println("Any kind of walk!");
    }

    @Override
    void breathing() {
        super.breathing();
        System.out.println("LabDab!");
    }
}
class Gawesh extends Man{
    void breathing(){
        super.breathing();
        System.out.println("Gawesh Breathing!");
    }
    void eat(){
        super.eat();
        System.out.println("Eating!");
    }
    void walk(){
        super.walk();
        System.out.println("Running!");
    }
}
class Running{
    public static void main(String[] args) {
        Human h = new Man();
        Human h1 = new Gawesh();
        Man m = new Gawesh();
        h.eat();
        h.walk();
        h.breathing();
        h1.eat();
        h1.walk();
        h1.breathing();
        m.eat();
        m.walk();
    }
}