class AirConditioner{

static Boolean isConnected=false;

public static boolean onOrOff(){

System.out.println("onOrOff method started");

isConnected=(!isConnected) ? true :false;


System.out.println("the onOrOff method is ended");
return isConnected;
}

}