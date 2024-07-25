class ClockRunner{
public static void main(String[]args)
{
System.out.println("start main in ClockRunner");
Clock clock=new Clock();
double price=clock.price;
String quality=clock.quality;
int quantity=clock.quantity;
System.out.println("clock:"+price);
System.out.println("clock:"+quality);
System.out.println("clock:"+quantity);
Clock clock1=new Clock();
clock1.quality="premium";
clock1.quantity=2;
System.out.println("updated clock:"+clock1.price);
System.out.println("updated clock:"+clock1.quality);
System.out.println("updated clock:"+clock1.quantity);


}
}