class SprayRunner{
public static void main(String[]args)
{
System.out.println("start main in SprayRunner");
Spray spray=new Spray();
String name=spray.name;
double price=spray.price;
int quantity=spray.quantity;
System.out.println("spray:"+name);
System.out.println("spray:"+price);
System.out.println("spray:"+quantity);
Spray spray1=new Spray();
spray1.name="cockroach";
spray1.price=140;
System.out.println("updated spray:"+spray1.name);
System.out.println("updated spray:"+spray1.price);
System.out.println("updated spray:"+spray1.quantity);


}
}