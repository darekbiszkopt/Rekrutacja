import javafx.stage.Stage;

import java.util.List;

public class Main extends javafx.application.Application {

    @Override
    public void start(Stage stage) throws Exception {

        MyStructure myStructure = new MyStructure();
        Node node = new Node("1234", "ggggg");
        Node node2 = new Node("1235", "hhhhh");
        Node node3 = new Node("1236", "iiiii");
        Node node4 = new Node("1237", "jjjjj");
        myStructure.addNode(node);
        myStructure.addNode(node2);
        myStructure.addNode(node3);
        myStructure.addNode(node4);



        System.out.println("Wyświetla adresy wszystkich węzłów:  " + myStructure.getNodes());
        System.out.println();
        System.out.println( node.getCode());
        System.out.println( node3.getRenderer());
        System.out.println("Wyświetla adres węzeła o podanym renderze:: " + myStructure.findByRenderer("iiiii"));
        System.out.println("Wyświetla adres węzeła o podanym kodzie:: " + myStructure.findByCode("1234"));
        System.out.println(myStructure.findByCode("12353"));
        System.out.println(myStructure.findByRenderer("hhhhj"));
        System.out.println("Metoda służąca do zliczania węzłów. Wyliczono " + myStructure.count() + " węzły");

    }


}
