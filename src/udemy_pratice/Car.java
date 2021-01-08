package udemy_pratice;

public class Car {
    private String color;
    private String type;

    public Car(){};
//    {
//        color = c ;
//        type = t;
//
//    }

    public void start() {
        System.out.println("Get started");
    }

    public void getDescription() {
        System.out.println("This is a " + color + " " + type);
    }

   public static void main(String[] args) {

        Car myCar = new Car();
        myCar.color = "blue";
        myCar.type = "sedan";

        myCar.getDescription();

    }

}
