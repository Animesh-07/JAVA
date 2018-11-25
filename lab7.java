import java.util.Scanner;
import Balance.Account;
class lab7
{
	public static void main(String args[])
	{
		String str,key;
		double amount;
		int i,n,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the total number of account holders");
		n=s.nextInt();
		Account a[]=new Account[n];
		for(i=0;i<n;i++)
		{
            System.out.println("enter the name of "+(i+1)+" st the account holder");
			str=s.next();
			System.out.println("enter the balance amount of "+str);
			amount=s.nextDouble();
			a[i]=new Account(str,amount);
		}
		System.out.println("enter the account holder name to access his balance ");
		key=s.next();
		for(i=0;i<n;i++)
		{
			if(key.equals(a[i].name))
			{
				flag=1;
			 	a[i].Display_Balance();
			}
		}
		if(flag==0)
		{ System.out.println("account holder not found"); }
	}
}