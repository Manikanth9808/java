import java.util.*;
class WatchShop{
static String watchBrand[]={null,null,null,null,null,null,null,null,null,null};
static int index;
static double price[]={0,0,0,0,0,0,0,0,0,0};
static int priceIndex;

public static boolean getNames(String name){
boolean isNameValid=false;
if(name !=null){
      watchBrand[index] =name;
	  index++;
	  isNameValid=true;
}
else System.out.println("not valid name");

return isNameValid;
}
public static boolean getPrice(double amount){
boolean isAmountValid=false;

if(amount>0){
price[priceIndex]=amount;
priceIndex++;
isAmountValid=true;
}
else System.out.println("amount not valid");
return isAmountValid;
}
public static boolean getUpdate(String oldName,String newName){
boolean isUpdate=false;
for(int i=0;i<watchBrand.length;i++){
if(oldName==watchBrand[i]){
watchBrand[i]=newName;
isUpdate=true;
}
}
return isUpdate;

}
public static boolean getDelete(String brandDelete){
	boolean isBrandDelete=false;
	int newIndex,oldIndex;
	for(newIndex=0,oldIndex=0;oldIndex<watchBrand.length;oldIndex++){
		if(watchBrand[oldIndex]!=brandDelete){
			watchBrand[newIndex]=watchBrand[oldIndex];
			newIndex++;
		}
	}
	watchBrand=Arrays.copyOf(watchBrand,newIndex);
	if(brandDelete!=null)
		isBrandDelete=true;
	else
		System.out.println("not valid");
	return isBrandDelete;
	
}
public static void getDetails(){
for(String element:watchBrand)
System.out.println(element);

for(double elements:price)
System.out.println(elements);
}
}