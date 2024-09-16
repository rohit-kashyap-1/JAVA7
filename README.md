# Lambda Expressions

Lambda Expressions were added in Java 8.

A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

```java
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
```
