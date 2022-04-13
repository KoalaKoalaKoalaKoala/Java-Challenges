public class Ford extends Car{
    private Car ford;

    public Ford(int cylinders, String name, Car ford) {
        super(cylinders, name);
        this.ford = ford;
    }

    @Override
    public String startEngine() {
        return "Ford - > start engine";
    }

    @Override
    public String accelerate() {
        return "Ford - > accelerate";
    }

    @Override
    public String brake() {
        return "Ford - > brake";
    }
}
