class GymRunner{
public static void main(String[] args){
boolean name=Gym.addEquipment("spin bike");
name=Gym.addEquipment("stair master");
name=Gym.addEquipment("calf machine");
name=Gym.addEquipment("ab roller");
name=Gym.addEquipment("barbell");
name=Gym.addEquipment("smith machine");
name=Gym.addEquipment("dipping bars");
name=Gym.addEquipment("elliptical");

boolean price=Gym.addPrice(3000);
price=Gym.addPrice(40000);
price=Gym.addPrice(50000);
price=Gym.addPrice(2000);
price=Gym.addPrice(20000);
price=Gym.addPrice(30000);
price=Gym.addPrice(30000);
price=Gym.addPrice(20000);
Gym.getEquipment();

boolean upodate=Gym.getUpdate("spin bike","treadmills");
Gym.getEquipment();

boolean delete=Gym.getDelete("spin bike");
Gym.getEquipment();
}


}