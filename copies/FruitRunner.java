class FruitRunner{
public static void main(String[]args)
{
System.out.println("start main in FruitRunner");
Fruit fruit=new Fruit();
String name=fruit.name;
double price=fruit.price;
String color=fruit.color;
System.out.println("name is:"+name);
System.out.println("price is:"+price);
System.out.println("color is:"+color);
Fruit fruit1=new Fruit();
fruit1.name="Apple";
fruit1.price=135;
fruit1.color="Red";
System.out.println("updated name is:"+fruit1.name);
System.out.println("updated price is:"+fruit1.price);
System.out.println("updated color is:"+fruit1.color);
}
}