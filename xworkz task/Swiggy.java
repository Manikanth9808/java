class Swiggy{
	static double price;
    public static double takeOrder(String name){

              if (name=="Ghee rice")
				  price=99.00;
                   

                
                if(name=="poth roast")
                    
				price=120;
                
                if(name=="egg biryani")
                   
				price=169;
                
                if(name=="gobi fried rice")
                   
				price=100;
                
                if(name=="mashroom fried rice")
                    
				price=120;
                
                if(name=="veg fried rice")
                     
				price=99;
                
                if(name=="chicken fried rice")
                     
					price=119;
                
                if(name=="panner noodles")
                     
				price=120;
                
                if(name=="veg noodles")
                     
				price=89;
                
                if(name=="egg noodles")
                   
				price=220;
                
                if(name=="chicken noodles")
                     
				price=139;
                
                if(name=="gobi 65")
                    
				price=80;
                
                if(name=="gobi manchurian")
                    
				price=139;
                
                if(name=="ginger chicken")
                     
			price=	179;
                
                if(name=="peper chicken")
                    
				price=20;
                

                else{
                    System.out.println(name + " not found");
					 
					price=0.0;
                
	}
	return price;
	}
	public static double takeOrder(String name,int quantity){
		if(name=="peper chicken")
			price=price*quantity;
		
		return price;
		
	}
}
 
