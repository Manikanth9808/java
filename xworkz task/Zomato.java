class Zomato{
	static double price;
    public static double takeOrder(String foodName){
		

                if(foodName=="pizza")
                    return 99.00;

                
                if(foodName=="burger")
                    return 120;
                
                if(foodName=="egg biryani")
                    return 169;
                
                if(foodName=="jeera rice")
                    return 100;
                
                if(foodName=="panner butter masal")
                    return 120;
                
                if(foodName=="dal makhani")
                    return 99;
                
                if(foodName=="dal fry")
                    return 119;
                
                if(foodName=="aloo matar masala")
                    return 120;
               
                if(foodName=="panner chole masala")
                    return 89;
                
                if(foodName=="egg fried rice")
                    return 220;
                
                if(foodName=="egg bhurji")
                    return 139;
                
                if(foodName=="egg rice")
                    return 80;
                
                if(foodName=="dal palak")
                    return 139;
                
                if(foodName=="mashroom masala")
                    return 179;
                
                if(foodName=="omlet")
                    return 20;
                

                else
                    System.out.println(foodName+"not found");
					return 0.0;
                
	}
	public static double takeOrder(String foodName,int quantity){
		if(foodName=="pizza")
			price= 99*quantity;
			
	return price;
	}
}
 
