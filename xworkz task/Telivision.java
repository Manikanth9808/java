class Telivision{

static boolean isConnected;
static int currentChannel;
static int minChannel;
static int maxChannel=10;

public static void onOrOff(){
System.out.println("on or off started");

if(isConnected==false){
isConnected=true;
System.out.println("tv is turned on");
}
else if(isConnected==true){
isConnected =false;
System.out.println("tv is turned off");

}
System.out.println("on off ended");
}

public static void increaseChannelNum(){
System.out.println("increase value() started");

if(isConnected==true){
if(currentChannel<=maxChannel){
currentChannel=currentChannel+1;
System.out.println("the current channel is "+currentChannel);
}
else{
System.out.println("max Channel reached");
}
}
else{
System.out.println("please turn on your tv");
}
System.out.println("increase Channel () ended");
}

public static void decreaseChannelNum(){
System.out.println("decrease value() started");

if(isConnected==true){
if(currentChannel<=maxChannel){
currentChannel=currentChannel-1;
System.out.println("the current Channel is "+currentChannel);
}
else{
System.out.println("min Channel reached");
}
}
else{
System.out.println("please turn on your tv");
}
System.out.println("decrease Channel () ended");
}


public static  void  TelivisionDetails(){
System.out.println("tv details() started");
		
String  name= "Samsung 4k";
double  price = 75000.00d ; 
String color= "black";
System.out.println("The Brand Name is "+ name);
System.out.println("The Brand Price is "+ price);
System.out.println("The Brand color is "+ color);
		 
System.out.println("tv deatils() ended");

}
}


  



