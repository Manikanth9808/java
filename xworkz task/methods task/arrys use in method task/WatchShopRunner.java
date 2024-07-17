class WatchShopRunner{
public static void main(String[] args){
boolean name= WatchShop.getNames("montblanc");
name= WatchShop.getNames("jeager-lecoutre");
name= WatchShop.getNames("audemars piguet");
name= WatchShop.getNames("frederique constant");
name= WatchShop.getNames("piaget");
name= WatchShop.getNames("cartier");
name= WatchShop.getNames("harry winston");
name= WatchShop.getNames("blancpain");
name= WatchShop.getNames("longines");
name= WatchShop.getNames("zenith");

boolean price=WatchShop.getPrice(200000);
price=WatchShop.getPrice(100000);
price=WatchShop.getPrice(210000);
price=WatchShop.getPrice(250000);
price=WatchShop.getPrice(300000);
price=WatchShop.getPrice(260000);
price=WatchShop.getPrice(330000);
price=WatchShop.getPrice(200000);
price=WatchShop.getPrice(270000);
price=WatchShop.getPrice(460000);

WatchShop.getDetails();

boolean update= WatchShop.getUpdate("zenith","tudor");
WatchShop.getDetails();
boolean delete=WatchShop.getDelete("montblanc");
WatchShop.getDetails();
}
}