class CrowRunner{
public static void main(String[]args)
{
System.out.println("start main in CrowRunner");
Crow crow=new Crow();
String color=crow.color;
String qualities=crow.qualities;
String eatingHabitat=crow.eatingHabitat;
System.out.println("crow:"+color);
System.out.println("crow:"+qualities);
System.out.println("crow:"+eatingHabitat);
Crow crow1=new Crow();
crow1.qualities="very clever";
crow1.eatingHabitat="insects";
System.out.println("updated crow:"+crow1.color);
System.out.println("updated crow:"+crow1.qualities);
System.out.println("updated crow:"+crow1.eatingHabitat);


}
}