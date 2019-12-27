class FindLarge{
public static void main(String args[]){
int number=87455;
int a=0;
while(number>0)
{
int mod=number%10;
if(a<mod)
{
a=mod;
}
number=number/10;
}
System.out.println("Largest Character in Number is="+a);
}
}
