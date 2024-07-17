class ChatShop1Runner{
public static void main(String[] args){
boolean names=ChatShop1.CreateChatName("bel puri");


names=ChatShop1.CreateChatName("masala puri");


names=ChatShop1.CreateChatName("dahi puri");


names=ChatShop1.CreateChatName("pani puri");


names=ChatShop1.CreateChatName("tikki puri");


names=ChatShop1.CreateChatName("allo puri");


boolean update=ChatShop1.getChatUpdated("tikki puri","mix puri");


boolean price=ChatShop1.getChatPrice(40);
System.out.println(price);
price=ChatShop1.getChatPrice(20);
System.out.println(price);
price=ChatShop1.getChatPrice(30);
System.out.println(price);
price=ChatShop1.getChatPrice(30);
System.out.println(price);
price=ChatShop1.getChatPrice(30);
System.out.println(price);
price=ChatShop1.getChatPrice(30);
ChatShop.getChatsName();

boolean deleted=ChatShop1.deleteChatName("tikki puri");
ChatShop.getChatsName();

}
}