abstract class School {
    void teaching(){
        System.out.println("teaching!");
    }
    abstract void learning();
}
class Grade11 extends School{
    @Override
    void learning() {
        System.out.println("Grade 11 students learning well!");
    }

    @Override
    void teaching() {
        super.teaching();
        System.out.println("Teacher teaching well!");
    }
}
class RunSchool{
    public static void main(String[] args) {
        School s = new Grade11();
        s.learning();
        s.teaching();
    }
}