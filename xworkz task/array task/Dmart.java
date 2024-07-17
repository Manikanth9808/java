class Dmart{
static String chocolates[]={"kit kat","dairy milk","snikers","milky bar"};

public static void main(String[] args){

System.out.println("all chocolates are:");

for(int index =0;index<chocolates.length;index++){
System.out.println(chocolates[index]);
}

System.out.println("another best option is:");
for(String chocolate:chocolates){
System.out.println(chocolate);
}
}
}