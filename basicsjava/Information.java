class Information{
public static void main(String[]Infos)
{
if (Infos.length==4)
{
String personName=Infos[0];
String personEmail=Infos[1];
String personAge=Infos[2];
String personPassword=Infos[3];
System.out.println("personName:"+personName);
System.out.println("personEmail:"+personEmail);
System.out.println("personAge:"+personAge);
System.out.println("personPassword:"+personPassword);
}
else
{
System.out.println("Not enough elements in the array");
}
}
}

