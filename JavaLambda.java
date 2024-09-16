import java.util.ArrayList;
import java.util.function.Consumer;
class JavaLambda{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Shushmita");
        names.add("Aman kumar");
        names.add("ranchhoddas channchhhad");
        names.add("raju rastogi");
        names.add("nitesh");

        //names.forEach((a)->System.out.println(a.toUpperCase()));
        Consumer<String> consumer = (e)->{System.out.println(e.toUpperCase());};
        names.forEach(consumer);
    }
}