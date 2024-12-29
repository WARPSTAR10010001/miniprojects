//Boo!!

package OOP2;

public class Person {
    private int age;
    private String name;
    private boolean isMale;

    public Person(int age, String name, boolean isMale){
        this.age = age;
        this.name = name;
        this.isMale = isMale;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

    @Override
    public String toString(){
        return "Hi, I'm " + this.name + ", I'm " + this.age + " years old and I'm probably male";
    }
}
