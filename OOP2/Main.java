//Boo!!

//Hell yeab brainrot code

package OOP2;

public class Main {

    public static void main(String[] args){
        Student WARPSTAR = new Student(18, "WARPSTAR", true);
        Student Steven = new Student(69, "Steve", true);
        Person UdoLindenberg = new Person(99, "Udo Lindenberg", true);
        Student Gurkenfresser = new Student(12, "Gurkenfresser", true);
        Person SaddamHussein = new Person(128, "Saddam Hussein", true);
        FirstSemesterStudent FortniteGamer233 = new FirstSemesterStudent(15, "Johannes von Brandenburg (der Idiot)", true, 55555, 1);

        Person [] personArray = {WARPSTAR, UdoLindenberg, Steven, Gurkenfresser, SaddamHussein, FortniteGamer233};

        for(int i = 0; i < personArray.length; i++){
            System.out.println(personArray[i]);
        }
    }
}
