public class Vars {
  public static void main(Strings[] args) {
    // How to define a variable 
    // Java variables must have types because Java is statically typed lang (you have to explicity mention data types)

    /*
    PRIMATIVE DATA TYPES:
    These are simple data types with no methods or attributes associated to them, because they aren't classes.
    Below are some examples
    */

    int numOfStocks = 100; // integers 
    char strongPwd = '1@fhfh2'; // Cannot use "" + for special characters like @#$
    double priceInDecimal = 3.99; // big or small numbers + decimals
    boolean isBoy = true; // true/false values only 
    
    /*
    REFERENCE DATA TYPES:
    These are complex data types WITH methods and attributes (sometimes), because they ARE classes which are referenced.
    Below are some examples
    */

    String name = "hemit";

    // For this type, we have access to different methods such as...
    System.out.println(name.length());
  }
}
