import java.util.*;
class GoldShop{
static String goldName[]={null,null,null,null,null,null,null};
static int index;
static double price[]={0,0,0,0,0,0,0};
static int getIndex;

public static boolean getGoldName(String name){
boolean isNameValid=false;
if(name !=null){
    goldName[index]=name;
	index++;
	isNameValid=true;
}
return isNameValid;

}

public static boolean getPrice(double amount){
 boolean isAmountValid=false;
 if(amount>0){
	   price[getIndex]  = amount;
	   getIndex++;
	   isAmountValid=true;
	   }
	   else System.out.println("not valid amount");
	   return isAmountValid;
	   }
	   public static boolean getUpdate(String oldName,String newName){
	   boolean isUpdate=false;
	   for(int i=0;i<goldName.length;i++){
	   if(oldName==goldName[i]){
	   goldName[i]=newName;
	   isUpdate=true;
	   }
	  
	   }
	   return isUpdate;
	   }
	   public static boolean getDelete(String goldToBeDeleted){
		   boolean isGoldDeleted=false;
		   int oldIndex,newIndex;
		   for(newIndex=0,oldIndex=0;oldIndex<goldName.length;oldIndex++){
			   if(goldName[oldIndex]!=goldToBeDeleted){
				   goldName[newIndex]=goldName[oldIndex];
				   newIndex++;
			   }
		   }
		   goldName=Arrays.copyOf(goldName,newIndex);
		   if(goldToBeDeleted!=null)
			   isGoldDeleted=true;
		   else
			   System.out.println("invalid");
		   return isGoldDeleted;
		   
	   }
	   public static void getDetails(){
	   for(String element:goldName)
	   System.out.println(element);
	   
	   for(double elements:price)
	   System.out.println(elements);
	   }
	   }