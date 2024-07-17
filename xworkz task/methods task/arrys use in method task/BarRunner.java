class BarRunner{
public static void main(String[] args){
boolean names=Bar.getName("fratelli");
names=Bar.getName("sula");
names=Bar.getName("charosa");
names=Bar.getName("grover zampa");
names=Bar.getName("krsma");
names=Bar.getName("york");
names=Bar.getName("big banyan");
names=Bar.getName("vallonne");
names=Bar.getName("yellow tail");
names=Bar.getName("barefoot");
names=Bar.getName("rythm");
names=Bar.getName("robert mondavi");
names=Bar.getName("rasa red wines");
names=Bar.getName("penfolds");
names=Bar.getName("chandon");


boolean price=Bar.getPrice(2300);
price=Bar.getPrice(2800);
price=Bar.getPrice(2700);
price=Bar.getPrice(2650);
price=Bar.getPrice(2900);
price=Bar.getPrice(2600);
price=Bar.getPrice(2100);
price=Bar.getPrice(2200);
price=Bar.getPrice(4300);
price=Bar.getPrice(3300);
price=Bar.getPrice(4600);
price=Bar.getPrice(5300);
price=Bar.getPrice(3700);
price=Bar.getPrice(2300);
price=Bar.getPrice(6300);

Bar.getDetails();

boolean update=Bar.getUpdate("fratelli","myra");
Bar.getDetails();

boolean delete=Bar.getDelete("sula");
Bar.getDetails();

}
}