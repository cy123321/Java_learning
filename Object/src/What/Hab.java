package What;
//  abstract class
abstract class Ha {
    public abstract void meet();
}

class Hm extends Ha {
    @Override
    public void meet() {
        System.out.println("Hai\n");
    }
}

public class Hab {
    public static void main(String[] args) {
        Ha h = new Hm();
        h.meet();
    }
}
