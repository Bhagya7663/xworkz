class StarterRunner{
public static void main(String[]args)
{
System.out.println("running main in StarterRunner");
if(args.length==4);
{
String name=args[0];
String price=args[1];
String weight=args[2];
String city=args[3];
double convertedPrice=Double.parseDouble(price);
float covertedWeight=Float.parseFloat(weight);
Starter.reset(name,covertedPrice,convertedWeight,city);
}
else{
System.out.println("getting atleast 4 arrays");
}
}
}