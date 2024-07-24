class CandyRunner{
	public static void main(String[]args)
{
System.out.println("start main in CandyRunner");
Candy candy=new Candy();
String name=candy.name;
double price=candy.price;
int quantity=candy.quantity;
System.out.println("name is:"+name);
System.out.println("price is:"+price);
System.out.println("quantity is:"+quantity);
Candy candy1=new Candy();
candy1.name="orange";
candy1.price=15;
candy1.quantity=20;
System.out.println("updated name is:"+candy1.name);
System.out.println("updated price is:"+candy1.price);
System.out.println("updated quantity is:"+candy1.quantity);
}
}
