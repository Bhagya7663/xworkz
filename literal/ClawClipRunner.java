class ClawClipRunner{
public static void main(String[]args)
{
System.out.println("start main in ClawClipRunner");
ClawClip clawclip=new ClawClip();
String name=clawclip.name;
double price=clawclip.price;
String color=clawclip.color;
System.out.println("clawclip:"+name);
System.out.println("clawclip:"+price);
System.out.println("clawclip:"+color);
ClawClip clawclip1=new ClawClip();
clawclip1.name="banana";
clawclip1.price=30;
System.out.println("updated clawclip:"+clawclip1.name);
System.out.println("updated clawclip:"+clawclip1.price);
System.out.println("updated clawclip:"+clawclip1.color);
}
}