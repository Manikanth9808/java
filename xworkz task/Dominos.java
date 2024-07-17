class Dominos{
	static String price;
    public static double takeOrder(String name){

                if(name=="margherita pizza"){
                    return 199.00;

                }
                if(name=="tandori pizza"){
                    return 320;
                }
                if(name=="veggie supreme"){
                    return 169;
                }
                if(name=="ultimate tandori"){
                    return 100;
                }
                if(name=="mazedar makhni paneer"){
                    return 390;
                }
                if(name==",maxican fista"){
                    return 319;
                }
                if(name=="veggie feast"){
                    return 219;
                }
                if(name=="spiced panner"){
                    return 220;
                }
                if(name=="corn &cheese"){
                    return 219;
                }
                if(name=="country feast"){
                    return 220;
                }
                if(name=="bold bbq veggies"){
                    return 339;
                }
                if(name=="american pizza"){
                    return 480;
                }
                if(name=="chicken pepperoni"){
                    return 139;
                }
                if(name==" chicken tikka supreme"){
                    return 179;
                }
                if(name=="malali chicken"){
                    return 320;
                }

                else{
                    System.out.println(name + " not found");
					return 0.0;
                }
	}
	public static double takeOrder(String name,int quantity){
		if(name=="tandori pizza")
			price=320*quantity;
		return price;
	}
}
 
