class Arrays{

public static void main(String[] args){

int add1[]={1,2,3,4,5,6,7,8,9,10,0};
int add2[]={45,45,45,45,45,45,45,45,45,45,45};
int result[]={0,0,0,0,0,0,0,0,0,0,0};

for(int i=0;i<=add1.length;i++){
	for(int j=0;j<add1.length;j++){
		result[i]=add1[i]+add2[i];
		
		
	}
	System.out.println(result[i]);
}
}
}