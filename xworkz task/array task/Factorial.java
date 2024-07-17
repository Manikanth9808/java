class Factorial{
public static int factorial(int n){
System.out.println("factorial method started");

int fact=1;

for(int num=1;num<=n;num++){
fact=num*fact;
}
System.out.println(fact);

System.out.println("factorial method ended");

return fact;
}

public static void main(String[] args){
System.out.println("main method started");


factorial(6);


System.out.println("main method ended");
}
}