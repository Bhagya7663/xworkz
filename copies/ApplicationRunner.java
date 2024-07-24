class ApplicationRunner{
public static void main(String[]args)
{
System.out.println("start main in ApplicationRunner");
Application application=new Application();
String name=application.education;
int num=application.num;
String city=application.city;
System.out.println("name is:"+name);
System.out.println("num is:"+num);
System.out.println("city is:"+city);
Application application1=new Application();
application1.name="Bhagya";
application1.num=35;
application1.city="bijapur";
System.out.println("updated name is:"+application1.name);
System.out.println("updated num is:"+application1.num);
System.out.println("updated city is:"+application1.city);
}
}