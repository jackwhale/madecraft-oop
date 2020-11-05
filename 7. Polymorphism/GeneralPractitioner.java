public class GeneralPractitioner extends Doctor {
    @Override
    public void doMedicine() {
        this.makeHouseCalls();
    }
    private void makeHouseCalls() {
        System.out.println("Making house call.");
    }
}
