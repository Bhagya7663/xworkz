class FoodRunner{
public static void main(String[]args)
{
System.out.println("start main in FoodRunner");
Food food=new Food();
String name=food.name;
double price=food.price;
int quantity=food.quantity;
System.out.println("name is:"+name);
System.out.println("price is:"+price);
System.out.println("quantity is:"+quantity);
Food food1=new Food();
food1.name="dosa";
food1.price=50;
food1.quantity=5;
System.out.println("updated name is:"+food1.name);
System.out.println("updated price is:"+food1.price);
System.out.println("updated quantity is:"+food1.quantity);
}
}