class KeyboardRunner{
public static void main(String[]args)
{
System.out.println("start main in KeyboardRunner");
Keyboard keyboard=new Keyboard();
String quality=keyboard.quality;
double price=keyboard.price;
int quantity=keyboard.quantity;
System.out.println("keyboard:"+quality);
System.out.println("keyboard:"+price);
System.out.println("keyboard:"+quantity);
Keyboard keyboard1=new Keyboard();
keyboard1.quality="latency";
keyboard1.quantity=2;
System.out.println("updated keyboard:"+keyboard1.quality);
System.out.println("updated keyboard:"+keyboard1.price);
System.out.println("updated keyboard:"+keyboard1.quantity);


}
}