class AirConditionRunner{
public static void main(String[]args)
{
System.out.println("start main in AirConditionRunner");
AirCondition aircondition=new AirCondition();
String name=aircondition.name;
double price=aircondition.price;
String quality=aircondition.quality;
System.out.println("name is:"+name);
System.out.println("price is:"+price);
System.out.println("quality is:"+quality);
}
}
