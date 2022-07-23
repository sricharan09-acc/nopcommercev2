package nopCommerce.nopCommerce;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int num=0;
 int count=0;
 
 if(num>1)
 {
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
			count++;
	}
	if(count==2)
	{
		System.out.println("its prime");
	}
	else
	{
		System.out.println("not prime");
	}
 }
 
 else
 {
	 System.out.println("not prime");
	 
 }
	}

}
