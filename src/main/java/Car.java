public class Car {
        String brand;
        String type;
        int buildYear;
        String color;
        float engineIntake;

        public Car(String brand, String type, int buildYear, String color, float engineIntake) {
            this.brand = brand;
            this.type = type;
            this.buildYear = buildYear;
            this.color = color;
            this.engineIntake = engineIntake;
        }

        public void print() {
            System.out.println("Deze " + brand + " " + type + " is " + color);
        }
}
