class ChatShopRunner{
public static void main(String[] args){
boolean names=ChatShop.CreateChatName("bel puri");
System.out.println(names);

names=ChatShop.CreateChatName("masala puri");
System.out.println(names);

names=ChatShop.CreateChatName("dahi puri");
System.out.println(names);

names=ChatShop.CreateChatName("pani puri");
System.out.println(names);

names=ChatShop.CreateChatName("tikki puri");
System.out.println(names);

names=ChatShop.CreateChatName("allo puri");
System.out.println(names);

boolean update=ChatShop.getChatUpdated("tikki puri","mix puri");
System.out.println(update);

boolean price=ChatShop.getChatPrice(40);
System.out.println(price);
price=ChatShop.getChatPrice(20);
System.out.println(price);
price=ChatShop.getChatPrice(30);
System.out.println(price);
price=ChatShop.getChatPrice(30);
System.out.println(price);
price=ChatShop.getChatPrice(30);
System.out.println(price);
price=ChatShop.getChatPrice(30);
ChatShop.getChatsName();

boolean delete=ChatShop.deleteChatName("allo puri");
ChatShop.getChatsName();


}
}