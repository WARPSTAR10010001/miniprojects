package OOP2;

class Student extends Person {
    private int studentID;

    public Student(int age, String name, boolean isMale, int studentID){
        super(age, name, isMale);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString(){
        return "Hi, I'm " + getName() + ", I'm " + getAge() + " years old and my student ID is " + this.studentID;
    }
}
