import java.util.*;
class  Bar{
static String winsName[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
static int index;
static double price[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
static int priceIndex;

public static boolean getName(String name){
boolean isNameValid=false;

if(name !=null){
    winsName[index] =name;
	index++;
	isNameValid=true;
	
}
else System.out.println("name are not valid");
return isNameValid;
}
public static boolean getPrice(double prices){
boolean isPriceValid=false;
if(prices>0){
     price[priceIndex] = prices;
	 priceIndex++;
	 isPriceValid=true;
}
else System.out.println("not valid price");

return isPriceValid;
}
public static boolean getUpdate(String oldBrand,String newBrand){
boolean isBrandValid=false;

for(int i=0;i<winsName.length;i++){
if(oldBrand==winsName[i]){
winsName[i]=newBrand;
isBrandValid=true;
}
}
return isBrandValid;
}
public static boolean getDelete(String winToBeDelete){
	boolean isWinDeleted=false;
	int oldIndex,newIndex;
	for(newIndex=0,oldIndex=0;oldIndex<winsName.length;oldIndex++){
		if(winToBeDelete !=winsName[oldIndex]){
			winsName[newIndex]=winsName[oldIndex];
			newIndex++;
		}
	}
	winsName=Arrays.copyOf(winsName,newIndex);
	if(winToBeDelete!=null)
		isWinDeleted=true;
	else System.out.println("not valid");
	return isWinDeleted;
}
public static void getDetails(){
for(String element:winsName)
System.out.println(element);

for(double elements:price)
System.out.println(elements);
}
}