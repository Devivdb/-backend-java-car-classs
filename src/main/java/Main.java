public class Main {
    public static void main(String[] args) {
        Car carOne = new Car("Fiat", "500", 2019, "groen", 1.4f);
        Car carTwo = new Car("Toyota", "Aygo", 2016, "blauwe", 1.2f);
        Car carThree = new Car("Volvo", "CX90", 2022, "zwarte", 2.0f);

        carOne.print();
        carTwo.print();
        carThree.print();
    }

}
