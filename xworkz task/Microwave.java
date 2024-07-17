class Microwave{

static boolean isConnected;
static int currentTempreature;
static int minTempreature;
static int maxTempreature=10;

public static void onOrOff(){
System.out.println("on or off started");

if(isConnected==false){
isConnected=true;
System.out.println("microwave is turned on");
}
else if(isConnected==true){
isConnected =false;
System.out.println("microwave is turned off");

}
System.out.println("on off ended");
}

public static void increaseMicrowave(){
System.out.println("increase temperature() started");

if(isConnected==true){
if(currentTempreature<=maxTempreature){
currentTempreature=currentTempreature+1;
System.out.println("the current temperature is "+currentTempreature);
}
else{
System.out.println("max value reached");
}
}
else{
System.out.println("please turn on your microwave");
}
System.out.println("increase temperature () ended");
}

public static void decreaseMicrowave(){
System.out.println("decrease temperature() started");

if(isConnected==true){
if(currentTempreature<=maxTempreature){
currentTempreature=currentTempreature-1;
System.out.println("the current temperature is "+currentTempreature);
}
else{
System.out.println("min value reached");
}
}
else{
System.out.println("please turn on your microwave");
}
System.out.println("decrease temperature () ended");
}


public static  void  microwaveDetails(){
System.out.println("microwaveDetails() started");
		
String  name= "Samsung";
double  price = 15000.00d ; 
System.out.println("The Brand Name is "+ name);
System.out.println("The Brand Price is "+ price);
		 
System.out.println("microwaveDetails() ended");

}
}


  



