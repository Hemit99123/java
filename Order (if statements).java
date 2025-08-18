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
    if (shipping.equals("Regular")) {
      return 0;
    } 
    
    else if (shipping.equals("Express") && couponCode.equals("ship50")) {
      return 0.85;
    } 
    
    else if (shipping.equals("Express")) {
      return 1.75;
    }
    
    else {
      return .50;
    }
 	}
}
