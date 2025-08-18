public class Order {
  boolean isFilled;
  double billAmount;
  String shipping;
  String couponCode;
  
  public Order(boolean filled, double cost, String shippingMethod, String coupon) {
		if (cost > 24.00) {
      System.out.println("High value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
    couponCode = coupon;
  }
  
  public double calculateShipping() {
    switch (shipping) {
      case "Regular": 
        return 0;
        break;
      
      case "Express":
        return 1.75;
        break;

      default:
        return 0.50;
        break;
    }
 	}
}
