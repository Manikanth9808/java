class FiveStarChicken{
	static double price;
    public static double takeOrder(String name){

                if(name=="tandoori chicken"){
                    return 144.00;

                }
                if(name=="chicken lolipop"){
                    return 320;
                }
                if(name=="chicken kabab"){
                    return 269;
                }
                if(name=="ultimate tandori"){
                    return 100;
                }
                if(name=="hot chicken wings"){
                    return 390;
                }
                if(name=="crispy chicken"){
                    return 319;
                }
                if(name=="cruncht chicken taco"){
                    return 119;
                }
                if(name=="murga seekh kebab"){
                    return 220;
                }
                if(name=="chicken popcorn medium"){
                    return 219;
                }
                if(name=="chicken filter burger"){
                    return 220;
                }
                if(name=="spicy lazeez bhuna"){
                    return 339;
                }
                if(name=="chicken dum biryani"){
                    return 480;
                }
                if(name=="bonless chicken birayani bowl"){
                    return 139;
                }
                if(name==" chicken 65"){
                    return 179;
                }
                if(name=="fgrill chicken"){
                    return 189;
                }

                else{
                    System.out.println(name + " not found");
					return 0.0;
                }
	}
	public static double takeOrder(String name,int quantity){
		if(name=="tandoori chicken")
			price=144*quantity;
		
		return price;
	}
}
 
