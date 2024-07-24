class RupeeRunner{
public static void main(String[]args)
{
System.out.println("start main in RupeeRunner");
Rupee rupee=new Rupee();
String name=rupee.name;
String code=rupee.code;
int year=rupee.year;
System.out.println("name is:"+name);
System.out.println("code is:"+code);
System.out.println("year is:"+year);
Rupee rupee1=new Rupee();
rupee1.name="one";
rupee1.code="INR";
rupee1.year=1892;
System.out.println("updated name is:"+rupee1.name);
System.out.println("updated code is:"+rupee1.code);
System.out.println("updated year is:"+rupee1.year);

}
}