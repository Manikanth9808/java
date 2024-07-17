import java.util.*;
class Textiles{
static String names[]={null,null,null,null,null,null,null,null,null,null,null};
static int index;
static double price[]={0,0,0,0,0,0,0,0,0,0,0};
static int priceIndex;

public static boolean getNames(String name){
boolean isNameValid=false;
if(name!=null){
names[index]=name;
index++;
isNameValid=true;
}
else System.out.println("name not valid");
return isNameValid;
}
public static boolean getPrice(double prices){
boolean isPriceValid=false;
if(prices>0){
price[priceIndex]=prices;
priceIndex++;
isPriceValid=true;

}
else System.out.println("price not valid");

return isPriceValid;
}
public static boolean getUpdate(String oldName,String newName){
boolean isUpdate=false;
for(int i=0;i<names.length;i++){
if(oldName==names[i]){
names[i]=newName;
isUpdate=true;
}
}
return isUpdate;
}
public static boolean getDelete(String deleted){
	boolean isDeleted=false;
	int newIndex,oldIndex;
	for(newIndex=0,oldIndex=0;oldIndex<names.length;oldIndex++){
		if(names[oldIndex]!=deleted){
			names[newIndex]=names[oldIndex];
			newIndex++;
		}
	}
	names=Arrays.copyOf(names,newIndex);
	if(deleted!=null)
		isDeleted=true;
	else System.out.println("not valid");
	return isDeleted;
}
public static void Details(){
for(String element:names)
System.out.println(element);

for(double elements:price)
System.out.println(elements);
}
}