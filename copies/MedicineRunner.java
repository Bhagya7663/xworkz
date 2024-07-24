class MedicineRunner{
public static void main(String[]args)
{
System.out.println("start main in MedicineRunner");
Medicine medicine=new Medicine();
String name=medicine.name;
double price=medicine.price;
int quantity=medicine.quantity;
System.out.println("name is:"+name);
System.out.println("price is:"+price);
System.out.println("quantity is:"+quantity);
Medicine medicine1=new Medicine();
medicine1.name="dolo";
medicine1.price=150;
medicine1.quantity=10;
System.out.println("updated name is:"+medicine1.name);
System.out.println("updated price is:"+medicine1.price);
System.out.println("updated quantity is:"+medicine1.quantity);
}
}