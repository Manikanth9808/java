class SwiggyRunner{

public static void main(String[] args){
System.out.println("the main method started");
double order=Swiggy.takeOrder("peper chicken");
System.out.println("the food price is "+order);

order=Swiggy.takeOrder("peper chicken",2);
System.out.println("the food price is "+order);

System.out.println("the main method ended");

}
}