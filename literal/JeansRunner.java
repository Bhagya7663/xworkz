class JeansRunner{
public static void main(String[]args)
{
Jeans jeans=new Jeans();
String brand=jeans.brand;
String color=jeans.color;
double price=jeans.price;
System.out.println("jeans:"+brand);
System.out.println("jeans:"+color);
System.out.println("jeans:"+price);
Jeans jeans1=new Jeans();
jeans1.brand="only";
jeans1.color="black";
jeans1.price=800;
System.out.println("jeans:"+jeans1.brand);
System.out.println("jeans:"+jeans1.color);
System.out.println("jeans:"+jeans1.price);

}
}

