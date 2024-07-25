class LolipopRunner{
public static void main(String[]args)
{
System.out.println("start main in LolipopRunner");
Lolipop lolipop=new Lolipop();
String name=lolipop.name;
double price=lolipop.price;
int quantity=lolipop.quantity;
System.out.println("lolipop:"+name);
System.out.println("lolipop:"+price);
System.out.println("lolipop:"+quantity);
Lolipop lolipop1=new Lolipop();
lolipop1.price=30;
lolipop1.quantity=2;
System.out.println("updated lolipop:"+lolipop1.name);
System.out.println("updated lolipop:"+lolipop1.price);
System.out.println("updated lolipop:"+lolipop1.quantity);


}
}