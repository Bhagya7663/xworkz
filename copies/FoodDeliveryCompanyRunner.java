class FoodDeliveryCompanyRunner{
public static void main(String[]args)
{
System.out.println("start main in FoodDeliveryCompanyRunner");
FoodDeliveryCompany fooddeliverycompany=new FoodDeliveryCompany();
String companyName=fooddeliverycompany.companyName;
String varieties=fooddeliverycompany.varieties;
String taste=fooddeliverycompany.taste;
System.out.println("companyName is:"+companyName);
System.out.println("varieties is:"+varieties);
System.out.println("taste is:"+taste);
}
}