class Mixer{

static boolean isConnected;
static int currentNum;
static int minNum;
static int maxNum=10;

public static void onOrOff(){
System.out.println("on or off started");

if(isConnected==false){
isConnected=true;
System.out.println("mixer is turned on");
}
else if(isConnected==true){
isConnected =false;
System.out.println("mixer is turned off");

}
System.out.println("on off ended");
}

public static void increaseNum(){
System.out.println("increase Num started");

if(isConnected==true){
if(currentNum<maxNum){
currentNum=currentNum+1;
System.out.println("the current number is "+currentNum);
}
else{
System.out.println("max Num reached");
}
}
else{
System.out.println("please turn on your Mixer");
}
System.out.println("increase number  ended");
}

public static void decreaseNum(){
System.out.println("decrease number started");

if(isConnected==true){
if(currentNum>maxNum){
currentNum=currentNum-1;
System.out.println("the current number is "+currentNum);
}
else{
System.out.println("min number reached");
}
}
else{
System.out.println("please turn on your Mixer");
}
System.out.println("decrease number ended");
}


public static  void  MixerDetails(){
System.out.println("mixer details started");
		
String  name= "PHILIPS";
double  price = 5000.00d ; 
System.out.println("The Brand Name is "+ name);
System.out.println("The Brand Price is "+ price);
		 
System.out.println("mixer deatils. ended");

}
}


  



