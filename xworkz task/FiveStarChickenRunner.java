class FiveStarChickenRunner{

public static void main(String[] args){
System.out.println("the main method started");
double order=FiveStarChicken.takeOrder("tandoori chicken");
System.out.println("the food price is "+ order);

order=FiveStarChicken.takeOrder("tandoori chicken",2);
System.out.println("the food price is "+ order);
System.out.println("the main method ended");

}
}