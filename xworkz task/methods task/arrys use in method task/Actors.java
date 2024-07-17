import java.util.Arrays;
class Actors{

static String addMovieActors[]={null,null,null,null,null,null,null,null,null};
static int index;


public static boolean getNames(String name){
boolean isNameValid=false;
if(name !=null){
         addMovieActors[index]  =name;
		 index++;
		 isNameValid=true;
}
else System.out.println("provide valid name");
return isNameValid;

}

public static boolean getUpdate(String oldName, String newName){
	
	boolean isUpdate=false;
	for(int i=0;i<addMovieActors.length;i++){
		if(oldName==addMovieActors[i]){
		addMovieActors[i]=newName;
		isUpdate=true;
	}
	//else System.out.println("not found name");
}

return isUpdate;

}

public static boolean getDelete(String actorToBeDeleted)
{
boolean isActorDeleted=false;
int oldIndex,newIndex;
for(newIndex=0,oldIndex=0;oldIndex<addMovieActors.length;oldIndex++)
{
if(addMovieActors[oldIndex] !=actorToBeDeleted)
{
		addMovieActors[newIndex]=addMovieActors[oldIndex];
		newIndex++; 
}	
} 
addMovieActors=Arrays.copyOf(addMovieActors,newIndex);
if(addMovieActors !=null)
	isActorDeleted=true;
else 
	System.out.println(actorToBeDeleted+"not found");
return isActorDeleted;
}

public static void getActorsNames(){
for(String element:addMovieActors)
System.out.println(element);

}
}