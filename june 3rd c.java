class C
{ int a;
A(int a)
{ this.a=a;}
void swap(A o)
{
int temp=this.a;
this.a=o.a;
o.a=temp;
}
public static void main(String args[])
{
A obj1=new A(5);
A obj2=new A(7);
System.out.println("obj1 has integer value->"+obj1.a);
System.out.println("obj2 has integer value->"+obj2.a);
obj1.swap(obj2);//this should swap using call by reference
System.out.println("obj1 has integer value->"+obj1.a);
System.out.println("obj2 has integer value->"+obj2.a);
}
}