class SimCard{
String name;
int id;
String plan;
String validity;

public boolean communication(String name,int id,String plan , String validity){
boolean isSimValid=false;
if(name!=null && id>0 && plan!=null && validity!=null){
	this.name=name;
	this.id=id;
	this.plan=plan;
	this.validity=validity;
	isSimValid=true;
}
return isSimValid;


}
public void getDetails(){
	System.out.println("the sim company is "+this.name);
	System.out.println("the id number is "+this.id);
	System.out.println("the plan is "+this.plan);
	System.out.println("the validity is "+this.validity);
	
}

}