class ActorsRunner{
public static void main(String[] args){
boolean name=Actors.getNames("akashy kumar");
name=Actors.getNames("gaurav verma");
name=Actors.getNames("amir khan");
name=Actors.getNames("dharukh khan");
name=Actors.getNames("karan johar");
name=Actors.getNames("deepika padukone");
name=Actors.getNames("alia bhatt");
name=Actors.getNames("abhishek bachchan");
name=Actors.getNames("rajinikanth");

Actors.getActorsNames();

System.out.println(" ");
System.out.println("new actors are");
boolean updated=Actors.getUpdate("amir khan","amita bachchan");
	
Actors.getActorsNames();
System.out.println("");
System.out.println("new actors are");
boolean delete=Actors.getDelete("amir khan");
Actors.getActorsNames();


}
}