class CabCompanyRunner{
public static void main(String[]args)
{
System.out.println("start main in CabCompanyRunner");
CabCompany cabcompany=new CabCompany();
String companyName=cabcompany.companyName;
double price=cabcompany.price;
int year=cabcompany.year;
System.out.println("companyname is:"+companyName);
System.out.println("price is:"+price);
System.out.println("year is:"+year);
}
}