class ZomatoRunner{

public static void main(String[] args){
System.out.println("the main method started");
double order=Zomato.takeOrder("pizza");
System.out.println("the food price is "+order);


order=Zomato.takeOrder("pizza",2);
System.out.println("the food price is "+order);
System.out.println("the main method ended");

}
}