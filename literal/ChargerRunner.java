class ChargerRunner{
public static void main(String[]args)
{
System.out.println("start main in ChargrRunner");
Charger charger=new Charger();
String name=charger.name;
String type=charger.type;
double cost=charger.cost;
System.out.println("charger:"+name);
System.out.println("charger:"+type);
System.out.println("charger:"+cost);
Charger charger1=new Charger();
charger1.name="lenovo";
charger1.type="c type";
System.out.println("updated charger:"+charger1.name);
System.out.println("updated charger:"+charger1.type);
System.out.println("updated charger:"+charger1.cost);
}
}
//nichi 


