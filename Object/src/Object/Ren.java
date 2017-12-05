package Object;

enum GENDER {
    MALE, FEMALE, NOTTELLING
}

public class Ren {
    static int total;

    //static block
    static {
        total = 2;
    }

    int age;
    boolean gender;

    Ren() {
        Ren.total++;
        age = 0;
        gender = true;
    }

    public static void main(String[] args) {
        GENDER gender = GENDER.FEMALE;
        // ordinal -> number in enum
        System.out.println(gender.toString() + " " + gender.ordinal());
    }
}

