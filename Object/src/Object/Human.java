package Object;

public class Human {
    public int age;    //  年龄
    public boolean gender; //  性别

    public Human() {
        age = 0;
        gender = true;
    }

    Human(int age) {
        this.age = age;
    }

    void talk() {}  //  行为
    void eat() {}   //  行为

    boolean isDead() {return true;}
}

class Man extends Human {
    void playdota() {}
    @Override
    void talk() {
        System.out.println("bala bala");
    }
}

class Woman extends Human {
    void selflie() {}
    @Override
    void talk() {
        while(true) System.out.println("bala bala");
    }
}
