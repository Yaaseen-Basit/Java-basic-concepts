class customer
{

int cid, qty;
String name;
customer( cid,name, qty)
{
for (int i=1;i<5;i++)
{

System.out.println("Customer ID is "+cid);
System.out.println("Customer Name is "+name);
System.out.println("Customer Quantity is "+qty);
}

}
}

class labq 
{
public static void main(String args[])

{

customer c1=new customer(1,"abs",20);
customer c2=new customer(2,"trs",40);

customer c3=new customer(3,"we",30);
customer c4=new customer(4,"bas",60);

customer c5=new customer(5,"pqr",70);

customer obj=new customer();
obj.show();

}
}
}
