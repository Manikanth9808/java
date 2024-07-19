class Garden{
   
   String name;
   String place;
   int id;
   double price;
   
   public boolean gettingFreshAir(String name,String place,int id,double price){
	   boolean isGardenValue=false;
	   if(name!=null && place!=null && id>0 && price>0){
		   this.name=name;
		   this.place=place;
		   this.id=id;
		   this.price=price;
		   isGardenValue=true;  
	   }
	   return isGardenValue;
}
public void getDetails(){
	System.out.println("the name is "+this.name);
	System.out.println("place is "+this.place);
	System.out.println("the id is "+this.id);
	System.out.println("the price is "+this.price);
}
}