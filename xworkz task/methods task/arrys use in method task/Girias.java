import java.util.*;
class Girias{

static String addNames[]={null,null,null,null,null,null,null,null,null,null,null,null};
static int index;
static double addPrice[]={0,0,0,0,0,0,0,0,0,0,0,0};
static int priceIndex;

public static boolean getNames(String name){
boolean isNameValid=false;
if(name !=null){
         addNames[index]  =name;
		 index++;
		 isNameValid=true;
}
else System.out.println("provide valid name");
return isNameValid;
}
public static  boolean getPrice(double price){
boolean isPriceValid=false;
if(price>0){
         addPrice[priceIndex]  =price;
		 priceIndex++;
		 isPriceValid=true;
}
else System.out.println("provide valid amount");
return isPriceValid;
}

public static boolean getUpdate(String oldName,String newName){
	boolean isUpdate=false;
	for(int i=0;i<addNames.length;i++){
		if(oldName==addNames[i]){
			addNames[i]=newName;
			isUpdate=true;
		}
	}
	return isUpdate;
	
	
}

public static boolean getDelete(String itemWillBeDeleted){
	boolean isDeleted=false;
	int newSize,oldIndex;
	for(newSize=0, oldIndex=0;oldIndex<addNames.length;oldIndex++){
		if(addNames[oldIndex]!=itemWillBeDeleted){
			addNames[newSize]=addNames[oldIndex];
			newSize++;
		}
	}
	addNames=Arrays.copyOf(addNames,newSize);
	if(itemWillBeDeleted !=null)
		isDeleted=true;
	else
		System.out.println(itemWillBeDeleted+"not found");
	return isDeleted;
}
public static void getDetails(){
for(String element:addNames)
System.out.println(element);

for(double elements :addPrice)
System.out.println(elements);
}
}