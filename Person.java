/**
 *  Class 
 * 
 */
public class Person {

    private String name; // field, property, state (thuộc tính)

    private int age;

    public Person (String name, int age) { // constructor 
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            System.out.println("Khong cho dang ky");
        } else{
            this.age = age;
        }
    }
}



