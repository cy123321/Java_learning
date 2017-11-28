package Object;

public class Society {

    Human[] members;
    Human you = new Human();
    Human me = new Human();

    void initlize() {
        members = new Human[2];
        members[0] = me;
        members[1] = you;
    }

    void functioning() {
        while(!me.isDead() && !you.isDead()) {
            me.talk();
            me.eat();
            you.talk();
            you.eat();
        }
    }

    public static void main(String[] args) {
        Society society = new Society();
        society.initlize();
        society.functioning();
    }
}
