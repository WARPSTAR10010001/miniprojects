//Boo!!

//Hell yeab brainrot code

package OOP2;

public class Main {

    public static void main(String[] args){
        Student WARPSTAR = new Student(18, "WARPSTAR", true, 35191);
        Student Steven = new Student(69, "Steve", true, 69420);
        Person UdoLindenberg = new Person(99, "Udo Lindenberg", true);
        Student Gurkenfresser = new Student(12, "Gurkenfresser", true, 10101);
        Person SaddamHussein = new Person(128, "Saddam Hussein", true);
        FirstSemesterStudent FortniteGamer233 = new FirstSemesterStudent(15, "Johannes von Brandenburg (der Idiot)", true, 55555, 1);

        Person [] personArray = {WARPSTAR, UdoLindenberg, Steven, Gurkenfresser, SaddamHussein, FortniteGamer233};

        for (Person personArray1 : personArray) {
            System.out.println(personArray1);
        }
    }
}
