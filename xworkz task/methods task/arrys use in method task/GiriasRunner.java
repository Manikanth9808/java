class GiriasRunner{
public static void main(String[] args){
boolean name=Girias.getNames("refrigerator");
name=Girias.getNames("hp 15s laptop");
name=Girias.getNames("boat  airbuds");
name=Girias.getNames("samsung smart phones");
name=Girias.getNames("drip cafe mixer");
name=Girias.getNames("deep kadia");
name=Girias.getNames("round tawa");
name=Girias.getNames("micro oven");
name=Girias.getNames("led 4k ultra hd tv");
name=Girias.getNames("1200mm rapid air fan");
name=Girias.getNames("cgx 2 eco gas");
name=Girias.getNames("macho iron");
Girias.getDetails();
boolean price=Girias.getPrice(40000);
price=Girias.getPrice(60000);
price=Girias.getPrice(4000);
price=Girias.getPrice(90000);
price=Girias.getPrice(4000);
price=Girias.getPrice(4000);
price=Girias.getPrice(400);
price=Girias.getPrice(400);
price=Girias.getPrice(40000);
price=Girias.getPrice(400000);
price=Girias.getPrice(2000);
price=Girias.getPrice(6000);
	


boolean update=Girias.getUpdate("hp 15s laptop","hp 14s");
Girias.getDetails();

boolean delete=Girias.getDelete("boat  airbuds");
Girias.getDetails();
}
}