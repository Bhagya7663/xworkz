class Palace{
public static void main(String[]stores)
{
if (stores.length==4)
{
String palaceName=stores[0];
String palaceLocation=stores[1];
String palaceBuiltBy=stores[2];
String palaceBuiltYear=stores[3];
System.out.println("palaceName:"+palaceName);
System.out.println("palaceLocation:"+palaceLocation);
System.out.println("palaceBuiltBy:"+palaceBuiltBy);
System.out.println("palaceBuiltYear:"+ palaceBuiltYear);
}
else
{
System.out.println("Not enough elements in the array");
}
}
}