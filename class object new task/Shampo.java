class Shampo{
String brandName;
int quantity;
double price;
String manifactureDate;
String expireDate;
int id;

public boolean carWash(String brandName, int quantity,double price,String manifactureDate,String expireDate,int id){
boolean isShampoValid=false;

if(brandName!=null && quantity>0 && price>0.0 && manifactureDate!=null && expireDate!=null && id>0){
	this.brandName=brandName;
	this.quantity=quantity;
	this.price=price;
	this.manifactureDate=manifactureDate;
	this.expireDate=expireDate;
	this.id=id;
	isShampoValid=true;
}
return isShampoValid;
}
public void getDetails(){
	System.out.println("the brand name is "+this.brandName);
	System.out.println("the quantity is "+this.quantity);
	System.out.println("the price is "+this.price);
	System.out.println("the manifacture date is"+this.manifactureDate);
	System.out.println("the expire date is "+this.expireDate);
	System.out.println("the id is "+this.id);
	
}
}