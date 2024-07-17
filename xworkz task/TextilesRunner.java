class TextilesRunner{
public static void main(String[] args){
boolean names= Textiles.getNames("cashmere");
names= Textiles.getNames("calico");
names= Textiles.getNames("jaconet");
names= Textiles.getNames("jersey");
names= Textiles.getNames("apparel & garment");
names= Textiles.getNames("fabric");
names= Textiles.getNames("home textiles");
names= Textiles.getNames("garment acccessories");
names= Textiles.getNames("technical textiles");
names= Textiles.getNames("textiles dyes");
names= Textiles.getNames("yarn");


boolean price=Textiles.getPrice(2000);
System.out.println("amount start form");
price=Textiles.getPrice(3000);
System.out.println("amount start form");
price=Textiles.getPrice(3200);
System.out.println("amount start form");
price=Textiles.getPrice(3400);
System.out.println("amount start form");
price=Textiles.getPrice(4000);
System.out.println("amount start form");
price=Textiles.getPrice(3500);
System.out.println("amount start form");
price=Textiles.getPrice(2000);
System.out.println("amount start form");
price=Textiles.getPrice(2500);
System.out.println("amount start form");
price=Textiles.getPrice(2800);
System.out.println("amount start form");
price=Textiles.getPrice(29000);
System.out.println("amount start form");
price=Textiles.getPrice(2200);


Textiles.Details();

boolean update=Textiles.getUpdate("leap7x","aha");

boolean deleted=Textiles.getDelete("getDelete");
Textiles.Details();
}
}