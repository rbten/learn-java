public class Student {
    protected double gpa;
    // any child class of Student can access gpa

    final protected boolean isStudent() {
        return true;
    }
    // any child class of Student can not modify isStudent()
}