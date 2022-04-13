public class Mitsubishi extends Car {

    private Car mitsubishi;

    public Mitsubishi(int cylinders, String name, Car mitsubishi) {
        super(cylinders, name);
        this.mitsubishi = mitsubishi;
    }

    @Override
    public String startEngine() {
        return "Mitsubishi - > start engine";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi - > accelerate";
    }

    @Override
    public String brake() {
        return "Mitsubishi - > brake";
    }
}
