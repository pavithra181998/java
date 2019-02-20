import java.util.Scanner;
class LCPrefix
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String t=sc.nextLine();
		String a[]=new String[n];
		boolean f=true;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextLine();
			a[i].trim();
		}
		String sub="";
		int i=0;
		while(f)
		{
			boolean same=true;
			char c=a[0].charAt(i);
			for(int j=1;j<n;j++)
			{
				if(a[j].charAt(i)!=c)
				{
					same=false;
					break;
				}
			}
			i++;
			if(!same)
				break;
			sub=sub+c;
		}
		System.out.println(sub);
	}
}
	