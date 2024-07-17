class Speaker{

static boolean isConnected;
static int currentValue;
static int minValue;
static int maxValue=10;

public static void onOrOff(){
System.out.println("on or off started");

if(isConnected==false){
isConnected=true;
System.out.println("Speaker is turned on");
}
else if(isConnected==true){
isConnected =false;
System.out.println("Speaker is turned off");

}
System.out.println("on off ended");
}

public static void increaseValue(){
System.out.println("increase value() started");

if(isConnected==true){
if(currentValue<=maxValue){
currentValue=currentValue+1;
System.out.println("the current value is "+currentValue);
}
else{
System.out.println("max value reached");
}
}
else{
System.out.println("please turn on your Speaker");
}
System.out.println("increase value () ended");
}

public static void decreaseValue(){
System.out.println("decrease value() started");

if(isConnected==true){
if(currentValue<=maxValue){
currentValue=currentValue-1;
System.out.println("the current value is "+currentValue);
}
else{
System.out.println("min value reached");
}
}
else{
System.out.println("please turn on your Speaker");
}
System.out.println("decrease value () ended");
}


public static  void  SpeakerDetails(){
System.out.println("speaker details() started");
		
String  name= "RCF";
double  price = 35000.00d ; 
System.out.println("The Brand Name is "+ name);
System.out.println("The Brand Price is "+ price);
		 
System.out.println("Speaker deatils() ended");

}
}


  



