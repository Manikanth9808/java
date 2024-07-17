class GoldShopRunner{
public static void main(String[] args){
boolean name=GoldShop.getGoldName("brooches");
name=GoldShop.getGoldName("rings");
name=GoldShop.getGoldName("necklaces");
name=GoldShop.getGoldName("earrings");
name=GoldShop.getGoldName("pendants");
name=GoldShop.getGoldName("bracelets");
name=GoldShop.getGoldName("cufflinks");

boolean price=GoldShop.getPrice(60000);
price=GoldShop.getPrice(62000);
price=GoldShop.getPrice(64000);
price=GoldShop.getPrice(63000);
price=GoldShop.getPrice(69000);
price=GoldShop.getPrice(68000);
price=GoldShop.getPrice(62500);

GoldShop.getDetails();

boolean update=GoldShop.getUpdate("rings","wedding rings");
GoldShop.getDetails();

boolean delete=GoldShop.getDelete("brooches");
GoldShop.getDetails();
}
}