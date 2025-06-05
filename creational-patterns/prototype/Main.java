public class Main {
    public static void main(String args[]) {
        Student originalStudent = new Student(20, 100, "Shake");
        Student cloneStudent = (Student) originalStudent.clone(); 
    }
}