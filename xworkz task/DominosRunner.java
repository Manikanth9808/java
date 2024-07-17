class DominosRunner{

public static void main(String[] args){
System.out.println("the main method started");
double order=Dominos.takeOrder("tandori pizza");
System.out.println("the food price is "+order);

order=Dominos.takeOrder("tandori pizza",2);
System.out.println("the food price is "+order);
System.out.println("the main method ended");

}
}