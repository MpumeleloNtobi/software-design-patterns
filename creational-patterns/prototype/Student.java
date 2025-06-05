public class Student implements Prototype {
    int age;
    private int studentNumber;
    String name;
    // Constructor 
    Student(){
    }
    // Constructor overload - different method signature 
    Student(int age, int studentNumber, String name){
        this.age = age;
        this.studentNumber = studentNumber;
        this.name = name;
    }
    @override
    public Prototype clone() {
        return new Student(this.age, this.studentNumber, this.name);
    }
}