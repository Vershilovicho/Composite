package HW_2;

/**
 * Реализовать паттерн Компоновщик
 */
public class Main {

    public static void main (String[] args){
        Share square1 = new Square();
        Share square2 = new Square();
        Share triangle1 = new Triangle();

        Share square3 = new Square();
        Share circle1 = new Cirсle();
        Share circle2 = new Cirсle();
        Share circle3 = new Cirсle();

        Composite composit = new Composite();
        Composite composit1 = new Composite();
        Composite composit2 = new Composite();

        composit1.addComponent(square1);
        composit1.addComponent(square2);
        composit1.addComponent(triangle1);

        composit2.addComponent(square3);
        composit2.addComponent(circle1);
        composit2.addComponent(circle2);
        composit2.addComponent(circle3);

        composit.addComponent(composit1);
        composit.addComponent(composit2);

        composit.draw();
    }
}
