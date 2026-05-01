class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    private String shape;
    private String cargoType;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargoType) {
        try {
            // Validation
            if (shape.equalsIgnoreCase("Rectangular") &&
                cargoType.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                    "Unsafe Assignment! Petroleum cannot be loaded in Rectangular Bogie."
                );
            }

            // Safe assignment
            this.cargoType = cargoType;
            System.out.println("Cargo assigned successfully: " + cargoType);

        } catch (CargoSafetyException e) {
            System.out.println("ERROR: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment process completed.\n");
        }
    }

    public String getCargoType() {
        return cargoType;
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {

        // Safe case
        GoodsBogie bogie1 = new GoodsBogie("Cylindrical");
        bogie1.assignCargo("Petroleum");

        // Unsafe case
        GoodsBogie bogie2 = new GoodsBogie("Rectangular");
        bogie2.assignCargo("Petroleum");

        // Program continues
        GoodsBogie bogie3 = new GoodsBogie("Rectangular");
        bogie3.assignCargo("Coal");

        System.out.println("Program continues safely after handling exceptions.");
    }
}