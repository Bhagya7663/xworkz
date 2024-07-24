class JuiceRunner{
public static void main(String[]args)
{
System.out.println("start main in JuiceRunner");
Juice juice=new Juice();
String name=juice.name;
double price=juice.price;
String varieties=juice.varieties;
System.out.println("name is:"+name);
System.out.println("price is:"+price);
System.out.println("varieties is:"+varieties);
Juice juice1=new Juice();
juice1.name="orange";
juice1.price=35;
juice1.varieties="many";
System.out.println("updated name is:"+juice1.name);
System.out.println("updated price is:"+juice1.price);
System.out.println("updated varieties is:"+juice1.varieties);
}
}