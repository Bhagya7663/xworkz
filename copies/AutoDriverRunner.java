class AutoDriverRunner{
public static void main(String[]args)
{
System.out.println("start main in AutoDriverRunner");
AutoDriver autodriver=new AutoDriver();
String name=autodriver.name;
int age=autodriver.age;
int contactNo=autodriver.contactNo;
System.out.println("name is:"+name);
System.out.println("age is:"+age);
System.out.println("contactNo is:"+contactNo);
}
}