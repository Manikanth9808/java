class Zepto{
	static double price;
    public static double takeOrder(String name){

                if(name=="potato chips")
                    return 109.00;
                
                if(name=="snacks banana chips")
                    return 160;
               
                if(name=="lays american cream")
                    return 169;
                
                if(name=="orion turtle chips")
                    return 100;
                
                if(name=="chicken nuggets")
                    return 320;
                
                if(name=="godrejnyummiez chicken nuggets")
                    return 99;
                
                if(name=="mccain french fries")
                    return 119;
                
                if(name=="mtr rava idli")
                    return 180;
                
                if(name=="schicken burger patty")
                    return 189;
                
                if(name=="kwality choco bar")
                    return 220;
                
                if(name=="sprite")
                    return 39;
                
                if(name=="coca cola soft drink")
                    return 80;
                
                if(name=="thums up soft drink")
                    return 39;
                
                if(name=="sprite soft drink")
                    return 79;
                
                if(name=="diet coke")
                    return 120;
                

                else
                    System.out.println(name + " not found");
					return 0.0;
                
	}
	public static double takeOrder(String name, int quantity){
		if(name=="potato chips")
			price=109.00*quantity;
			
		return price;
}

}
 
