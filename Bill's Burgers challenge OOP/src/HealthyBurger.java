public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;


    public HealthyBurger( String meat, double price) {
        super("Healthy Burger", meat, price, "dark bread roll");

    }

    public void addHealthyAddition1(String name, double healthyExtra1Price){
        healthyExtra1Name =name;
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public void addHealthyAddition2(String name, double healthyExtra2Price){
        healthyExtra2Name =name;
        this.healthyExtra2Price = healthyExtra2Price;

    }

    @Override
    public double itemizeHamburger() {
        return (super.itemizeHamburger() + healthyExtra1Price + healthyExtra2Price);
    }
}
