import java.util.Scanner;
public class Shopping{
public static void main(String[] args){
int req;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Req");
req=sc.nextInt();
switch(req){
case 1:{
System.out.println("Welcome to Sri Indu mall");
System.out.println("name of the items");
System.out.println("Brand name abc");
double cost=5999;
System.out.println("Price :"+cost);
double discount=1200;
System.out.println("Discount 20%");
double totalcost=cost-discount;
System.out.println("After discount"+totalcost);
System.out.println("ccgst and sgst 5%");
double gst=240+totalcost;
System.out.println("Total cost is:"+gst);
break;
}
case 2:{
System.out.println("Welcome to Sri Indu mall");
System.out.println("name of the items");
System.out.println("Brand name abc");
double cost=6999;
System.out.println("Price :"+cost);
double discount=1300;
System.out.println("Discount 20%");
double totalcost=cost-discount;
System.out.println("After discount"+totalcost);
System.out.println("ccgst and sgst 5%");
double gst=280+totalcost;
System.out.println("Total cost is:"+gst);
break;
}

default:{
System.out.println("No items");
}
}
}
}

