class RapidoRunner{
public static void main(String[]args)
{
System.out.println("start main in RapidoRunner");
Rapido rapido=new Rapido();
String name=rapido.name;
double price=rapido.price;
int contactNo=rapido.contactNo;
System.out.println("name is:"+name);
System.out.println("price is:"+price);
System.out.println("contactNo is:"+contactNo);
}
}