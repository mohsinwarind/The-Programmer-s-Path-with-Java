public class NestedSwitchExample {
    public static void main(String[] args) {
        String vehicleType = "Car";
        String vehicleModel = "Sedan";

        switch (vehicleType) {
            case "Motorcycle":
                switch (vehicleModel) {
                    case "Sport":
                        System.out.println("You selected a Sport motorcycle.");
                        break;
                    case "Cruiser":
                        System.out.println("You selected a Cruiser motorcycle.");
                        break;
                    default:
                        System.out.println("Unknown motorcycle model.");
                        break;
                }
                break;
            case "Car":
                switch (vehicleModel) {
                    case "Sedan":
                        System.out.println("You selected a Sedan car.");
                        break;
                    case "SUV":
                        System.out.println("You selected an SUV car.");
                        break;
                    default:
                        System.out.println("Unknown car model.");
                        break;
                }
                break;
            default:
                System.out.println("Unknown vehicle type.");
                break;
        }
    }
}
