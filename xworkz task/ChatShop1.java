import java.util.Arrays;
class ChatShop1
{

static String chatNames[]={null,null,null,null,null,null};
static int chatPrice[]={0,0,0,0,0,0};
static int oldIndex;
static int priceIndex;

public static boolean CreateChatName(String names){
	System.out.println("the CreateChatName started");
boolean isChatNameCreated=false;
if(names !=null)
{
chatNames[oldIndex]=names;
oldIndex++;
isChatNameCreated=true;
}
else System.out.println("null cannot be added");
System.out.println("CreateChatName ended");
return isChatNameCreated;

}
public static boolean getChatPrice(int price)
{
	boolean isPriceValid=false;
	
	if(price >0)
	{
		chatPrice[priceIndex]=price;
		priceIndex++;
		isPriceValid=true;
	}
	else System.out.println("provide valid price");
	return isPriceValid;
	
	
}
public static boolean getChatUpdated(String oldChatName, String newChatName){
	boolean isUpdated=false;
	for(int index=0;index<chatNames.length;index++){
	if(oldChatName == chatNames[index]){
	chatNames[index]=newChatName;
	isUpdated=true;
	 }
}
if(isUpdated==false)
	System.out.println("not found chat name");
return isUpdated;
}
public static boolean deleteChatName(String chatNameToBeDeleted){
	boolean isChatNameDeleted=false;
	int oldIndex, newIndex;
	for(newIndex=0,oldIndex=0;oldIndex<chatNames.length;oldIndex++)
	{
		if(chatNames[oldIndex] != chatNameToBeDeleted)
		{
		chatNames[newIndex]=chatNames[oldIndex];
		newIndex++;
		}
	}
	chatNames=Arrays.copyOf(chatNames,newIndex);
	if(chatNames !=null)
	isChatNameDeleted=true;

	else System.out.println(chatNameToBeDeleted+"not found");
	return isChatNameDeleted;
}





public static void getChatsName(){
System.out.println("the available chats are:");
for(String chatName:chatNames)

System.out.println(chatName);

for(int chatPrices : chatPrice)
	System.out.println(chatPrices);

}
}