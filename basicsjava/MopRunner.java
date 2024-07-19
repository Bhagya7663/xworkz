class MopRunner{
public static void main(String[]args)
{
System.out.println("running main in MopRunner");
  if(args.length==5)
{
String name=args[0];
String brand=args[1];
String flavour=args[2];
String price=args[3];
String quantity=args[4];
double convertedPrice=Double.parseDouble(price);
int convertedQuantity=Integer.parseInt(quantity);
Mop.juiceInfos(name,brand,flavour,convertedPrice,convertedQuantity);
}
else {
System.out.println("getting atleast 5 arrays");
}
}
}