class LibertyRunner{
public static void main(String[] args){
boolean names= Liberty.getNames("aha");
names= Liberty.getNames("footfun");
names= Liberty.getNames("fortune");
names= Liberty.getNames("gliders");
names= Liberty.getNames("perfect");
names= Liberty.getNames("senorita");
names= Liberty.getNames("coolers");
names= Liberty.getNames("force10");
names= Liberty.getNames("lucy & luke");
names= Liberty.getNames("healers");
names= Liberty.getNames("leap7x");

boolean price=Liberty.getPrice(2000);
price=Liberty.getPrice(3000);
price=Liberty.getPrice(3200);
price=Liberty.getPrice(3400);
price=Liberty.getPrice(4000);
price=Liberty.getPrice(3500);
price=Liberty.getPrice(2000);
price=Liberty.getPrice(2500);
price=Liberty.getPrice(2800);
price=Liberty.getPrice(2900);
price=Liberty.getPrice(2200);

Liberty.Details();

boolean update=Liberty.getUpdate("leap7x","aha");

boolean deleted=Liberty.getDelete("aha");
Liberty.Details();
}
}