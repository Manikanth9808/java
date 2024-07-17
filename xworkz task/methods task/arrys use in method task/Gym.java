import java.util.Arrays;
class Gym{
static String gymEquipments[]={null,null,null,null,null,null,null,null};
static int oldIndex;
static double amount[]={0,0,0,0,0,0,0,0};
static int priceIndex;


public static boolean addEquipment(String name){
boolean isEquipmentValid=false;

if(name !=null){
        gymEquipments[oldIndex]  =name;
		oldIndex++;
		isEquipmentValid=true;
}
else System.out.println("provide valid equipment");

return isEquipmentValid;

}
public static boolean addPrice(double price){
boolean isPriceValid=false;
if(price>0){
       amount[priceIndex] = price;
	   priceIndex++;
	   isPriceValid=true;
}
else System.out.println("please provide valid amount");

return isPriceValid;
}
public static boolean getUpdate(String oldName,String newName){
	boolean isUpdate=false;
	for(int i=0;i<gymEquipments.length;i++)
	{
		if(oldName==gymEquipments[i])
		{
			gymEquipments[i]=newName;
			isUpdate=true;
		}
	}
	return isUpdate;
}
public static boolean getDelete(String gymNameTOBeDeleted)
{
boolean isNameDeleted=false;
int oldIndex,newIndex;
for(newIndex=0,oldIndex=0;oldIndex<gymEquipments.length;oldIndex++)
{
	if(gymEquipments[oldIndex] !=gymNameTOBeDeleted)
	{
		gymEquipments[newIndex]=gymEquipments[oldIndex];
		newIndex++;
	}
}
	gymEquipments=Arrays.copyOf(gymEquipments,newIndex);
	if(gymEquipments !=null)
		isNameDeleted=true;
	else 
		System.out.println(gymNameTOBeDeleted+"not found");
	return isNameDeleted;
	
}


public static void getEquipment(){
for(String elements:gymEquipments)
System.out.println(elements);


for(double element:amount)
System.out.println(element);
}

}