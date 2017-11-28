package Object;

public class God {
    public static void main(String[] args) {
        Human you = new Human();
        Human me = new Human();
        while(!me.isDead() && !you.isDead()) {
            me.talk();
            you.talk();
            me.eat();
            you.eat();
        }
    }
}
