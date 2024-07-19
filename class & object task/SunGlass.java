class SunGlass{
String name;
String type;
int id;
double price;
String color;
public  boolean styling(String name,String type,int id,double price , String color){
	
	boolean isNameValid=false;
	if(name !=null && type !=null && id>0 && price >0.0 && color !=null){
		this.name=name;
		this.type=type;
		this.id=id;
		this.price=price;
		this.color=color;
		isNameValid=true;
	}
	return isNameValid;

}
public void getDisplay(){
	System.out.println("the item name is "+this.name);
	System.out.println("the item type is "+this.type);
	System.out.println("the item id is "+this.id);
	System.out.println("the item price is "+this.price);
	System.out.println("the item color is "+this.color);
	System.out.println(" ");
}
}