class AirConditionerRunner{

public static void main(String[] args){
System.out.println("main method started");


boolean connected=AirConditioner.onOrOff();
System.out.println(connected);
connected=AirConditioner.onOrOff();
System.out.println(connected);

System.out.println("main method is ended");
}
}