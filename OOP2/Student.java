package OOP2;

class Student extends Person {
    private int studentID;
    private static int nextStudentID = 1;

    public Student(int age, String name, boolean isMale){
        super(age, name, isMale);
        this.studentID = nextStudentID;
        nextStudentID++;
    }

    public int getStudentID(){
        return this.studentID;
    }

    @Override
    public String toString(){
        return "Hi, I'm " + getName() + ", I'm " + getAge() + " years old and my student ID is " + this.studentID;
    }
}
