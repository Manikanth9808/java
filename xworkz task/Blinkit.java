class Blinkit{
	static double price;
    public static double takeOrder(String name){

                if(name=="nandini shubham fresh milk")
                    return 27.00;

                
                if(name=="nandini curd")
                    return 26;
                
                if(name=="nandini toned fresh milk")
                    return 24;
                
                if(name=="quaker rolled oats")
                    return 179;
                
                if(name=="sunpure sunflower oil")
                    return 190;
                
                if(name=="ariel top load liquid")
                    return 319;
                
                if(name=="onion")
                    return 60;
                
                if(name=="potato")
                    return 53.00;
                
                if(name=="desi tomato")
                    return 49;
                
                if(name=="green chilli")
                    return 22;
                
                if(name=="lemon 6pcs")
                    return 48;
                
                if(name=="lady finger")
                    return 23;
                
                if(name=="orange carrot")
                    return 50;
                
                if(name==" green cucumber")
                    return 16;
                
                if(name=="button mashroom")
                    return 63;
                

                else
                    System.out.println(name + " not found");
					return 0.0;
                
	}
	public static double takeOrder(String name,int quantity){
		if(name=="nandini curd")
			price=26*quantity;
		return price;
	}
	
}
 
