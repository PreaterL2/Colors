import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> listy = new ArrayList(5);
        System.out.println("Dodawanie elementów do arraylisty");
        listy.add("green");
        listy.add("blue");
        listy.add("red");
        listy.add("yellow");
        listy.add("grey");

        for (String element : listy)
            System.out.println(element);
        System.out.println();

        System.out.println("podmiana elementu 1 w liscie na inny kolor");
        listy.set(1, "black");
        System.out.println(listy);
        System.out.println();

        System.out.println("usuniecie 0 elementu listy");
        listy.remove("blue");
        System.out.println(listy);
        System.out.println();

        System.out.println("dodanie kolejnego elementu listy");
        listy.add(0, "pink");
        System.out.println(listy);
        System.out.println();

        System.out.println("wypisanie wybranych elementow listy");
        String element = listy.get(0);
        System.out.println(element);

        element = listy.get(2);
        System.out.println(element);
        System.out.println();

        System.out.println("wyszukanie elementu w liscie");
        if (listy.contains("black")) {
            System.out.println("zawiera lista ten kolor");
        } else {
            System.out.println("braka tego koloru w liscie");
        }
        System.out.println();

        System.out.println("sortowanie elementow alfabetycznie");
        System.out.println("lista kolorow przed sortowaniem" + listy);
        Collections.sort(listy);
        System.out.println("lista kolorow po sortowaniu" + listy);
        System.out.println();
    }
}