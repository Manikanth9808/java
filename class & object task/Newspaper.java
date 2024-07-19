class Newspaper{
String companyName;
int noOfPages;
String language;
double price;
public boolean  currentAffairs(String companyName,int noOfPages,String language,double price){
	boolean isNameValid=false;
	if(companyName!=null && noOfPages>0 && language!=null && price>0.0){
		this.companyName=companyName;
		this.noOfPages=noOfPages;
		this.language=language;
		this.price=price;
		isNameValid=true;
	}
	return isNameValid;
}
public void getDetails(){
	System.out.println("the company name is "+this.companyName);
	System.out.println("the no of pages is "+this.noOfPages);
	System.out.println("the language is "+this.language);
	System.out.println("the price is "+this.price);
	System.out.println(" ");
}
}