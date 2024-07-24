class AlcoholBrandRunner{
public static void main(String[]args)
{
System.out.println("start main in AlcoholBrandRunner");
AlcoholBrand alcoholbrand=new AlcoholBrand();
String name=alcoholbrand.name;
double price=alcoholbrand.price;
String quality=alcoholbrand.quality;
System.out.println("name is:"+name);
System.out.println("price is:"+price);
System.out.println("quality is:"+quality);
AlcoholBrand alcoholbrand1=new AlcoholBrand();
alcoholbrand1.name="orange";
alcoholbrand1.price=35;
alcoholbrand1.quality="premium";
System.out.println("updated name is:"+alcoholbrand1.name);
System.out.println("updated price is:"+alcoholbrand1.price);
System.out.println("updated quality is:"+alcoholbrand1.quality);
}
}