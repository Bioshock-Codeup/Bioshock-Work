package pod;

public class bicycle {
        int cadence = 0;
        int speed = 0;
        int gear = 1;

        void changeCadence(int newValue) {

            cadence = newValue;
        }

        void changeGear(int newValue) {

            gear = newValue;
        }

        void speedUp(int increment) {

            speed = speed + increment;
        }

        void applyBrakes(int decrement) {

            speed = speed - decrement;
        }

        void printStates() {
            System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
        }
    }


    class BicycleDemo {
        public static void main(String[] args) {

            // Create two different
            // Bicycle objects
            bicycle bike1 = new bicycle();
            bicycle bike2 = new bicycle();
            bicycle bike3 = new MountainBike();


            // Invoke methods on
            // those objects
            System.out.println("my dads bike");
            bike1.changeCadence(50);
            bike1.speedUp(10);
            bike1.changeGear(2);
            bike1.applyBrakes(3);
            bike1.printStates();

            System.out.println("my bike");
            bike2.changeCadence(50);
            bike2.speedUp(10);
            bike2.changeGear(2);
            bike2.applyBrakes(3);
            bike2.printStates();


            System.out.println("The 3rd one is a mountainbike");
            bike3.printStates();
        }
    }

