package What;
//   interface
interface Com {
    public String talkTo(String message);
}

class Hum implements Com {
    @Override
    public String talkTo(String message) {
        System.out.println("hh");
        return "Hello\n";
    }
}
public class Inter {
    public static void main(String[] args) {
        Hum hu = new Hum();
        hu.talkTo("hhhhhh");
    }
}
