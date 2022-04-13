public class Holden extends Car {


        private Car holden;

    public Holden(int cylinders, String name, Car holden) {
        super(cylinders, name);
        this.holden = holden;
    }

    @Override
    public String startEngine() {
        return "Holden - > start engine";
    }

    @Override
    public String accelerate() {
        return "Holden - > accelerate";
    }

    @Override
    public String brake() {
        return "Holden - > brake";
    }


}
