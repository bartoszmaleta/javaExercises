package examplesFromCodeCademy;

public class Order {
    boolean isFilled;
    double billAmount;
    String shipping;
    
    public Order(final boolean filled, final double cost, final String shippingMethod) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }

    public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
            System.out.println("Shipping cost: " + calculateShipping());
        } else {
            System.out.println("Order not ready");
        }
    }

    public double calculateShipping() {
        // declare conditional statement here
        if (shipping.equals("Regular")) {
            return 0;
        } else if (shipping.equals("Express")) {
            return 1.75;
        } else {
            return .50;
        }
    }

    public double calculateShippingWithSwitchStatement() {
        double shippingCost;

        // declare switch statement here
        switch (shipping) {
        case "Regular":
            shippingCost = 0;
            break;
        case "Express":
            shippingCost = 1.75;
            break;
        default:
            shippingCost = .50;
        }

        return shippingCost;
    }

    public static void main(final String[] args) {
        // do not alter the main method!
        final Order book = new Order(true, 9.99, "Express");
        final Order chemistrySet = new Order(false, 72.50, "Regular");
      
      book.ship();
      chemistrySet.ship();
    }
  }