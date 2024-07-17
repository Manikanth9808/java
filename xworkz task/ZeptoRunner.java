class ZeptoRunner{

public static void main(String[] args){
System.out.println("the main method started");
double order=Zepto.takeOrder("potato chips");
System.out.println("the food price is "+order);

order=Zepto.takeOrder("potato chips",4);
System.out.println("the food price is "+order);
System.out.println("the main method ended");

}
}