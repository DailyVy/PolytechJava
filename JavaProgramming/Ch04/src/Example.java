class Person {
    private int age;

    void setAge(int age) {
        this.age = age;
    }
    int getAge() {
        return this.age;
    }
}
class Power {
    private int kick;


    private int punch;

    Power() {}
    Power(int kick, int punch) {
        this.kick = kick;
        this.punch = punch;
    }

    void setKick(int kick) {
        this.kick = kick;
    }
    int getKick() {
        return kick;
    }

    public int getPunch() {
        return punch;
    }

    public void setPunch(int punch) {
        this.punch = punch;
    }
}

public class Example {
    public static void main(String[] args) {
        Person aPerson = new Person();
        aPerson.setAge(17);
        System.out.println(aPerson.getAge());

        Power robot = new Power(10, 20 );
    }
}
