//Boo!!

package OOP2;

public class FirstSemesterStudent extends Student {
    private int currentSemester;

    public FirstSemesterStudent(int age, String name, boolean isMale, int studentID, int currentSemester){
        super(age, name, isMale, studentID);
        this.currentSemester = currentSemester;
    }

    public int getCurrentSemester(){
        return this.currentSemester;
    }

    public void setCurrentSemester(int currentSemester){
        this.currentSemester = currentSemester;
    }

    @Override
    public String toString(){
        return "Hi, I'm currently studying in semester " + currentSemester + ", my name is " + getName() + ", I'm " + getAge() + " years old and my student ID is " + getStudentID() + ".";
    }
}
