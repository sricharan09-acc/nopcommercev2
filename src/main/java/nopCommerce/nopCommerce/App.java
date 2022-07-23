package nopCommerce.nopCommerce;

public class App {
  public static void main(String[] args) {
   
    String a="welcomeeee";
    int len=a.length();
    int count=0;
    
    System.out.println(len);
    for(int i=0;i<len;i++)
    {
    	if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
    	{
    		
    	count++;
    	}
    	else
    	{
    		
    	}
    
    }
	System.out.println("no of  vowels are" +count);
  }
}
