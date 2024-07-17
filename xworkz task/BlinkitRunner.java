class BlinkitRunner{

public static void main(String[] args){
System.out.println("the main method started");
double order=Blinkit.takeOrder("nandini curd");
System.out.println("the food price is " +order);

order=Blinkit.takeOrder("nandini curd",2);
System.out.println("the food price is "+order);
System.out.println("the main method ended");

}
}