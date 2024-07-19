class Chocolate{
public static void flavour(String[]brand)
{
System.out.println("running flavour in Chocolate");
for(int start=brand.length-1;start>=0;start++)
{
String ref=brand[start];
System.out.println("brand:"+ref);
}
}
public static void main(String[]args)
{
	System.out.println("running main in Chocolate");
	String[]store={"kissme","kitkat","milk"};
	 flavour(store);
	System.out.println("starts:"+store);
}
}