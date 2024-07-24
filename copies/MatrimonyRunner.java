class MatrimonyRunner{
public static void main(String[]args)
{
System.out.println("start main in MatrimonyRunner");
Matrimony matrimony=new Matrimony();
String education=matrimony.education;
String career=matrimony.career;
String lifeStyle=matrimony.lifeStyle;
System.out.println("education is:"+education);
System.out.println("career is:"+career);
System.out.println("lifeStyle is:"+lifeStyle);
Matrimony matrimony1=new Matrimony();
matrimony1.education="BA";
matrimony1.career="Engineer";
matrimony1.lifeStyle="brahmin";
System.out.println("updated education is:"+matrimony1.education);
System.out.println("updated career is:"+matrimony1.career);
System.out.println("updated lifeStyle is:"+matrimony1.lifeStyle);
}
}