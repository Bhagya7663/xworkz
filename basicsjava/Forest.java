class Forest{
public static void main(String[]values)
{
if (values.length==4)
{
String forestName=values[0];
String forestArea=values[1];
String forestEtablishedYear=values[2];
String forestState=values[3];
System.out.println("forestName:"+forestName);
System.out.println("forestArea:"+forestArea);
System.out.println("forestEtablishedYear:"+forestEtablishedYear);
System.out.println("forestState:"+forestState);
}
else
{
System.out.println("Not enough elements in the array");
}
}
}