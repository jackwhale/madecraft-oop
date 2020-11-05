public class Surgeon extends Doctor {
    @Override
    public void doMedicine() {
        this.performsSurgery();
    }
    private void performsSurgery() {
        System.out.println("Performing surgery.");
    }
}
