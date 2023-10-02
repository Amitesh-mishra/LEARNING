package palindromeChecker;

public class CheckPalindrome {
	public boolean palindromeOrNot(int n)
	{
		int revnum=0;
		int tempn=n;
		while(n>0)
		{
			int lDigit=n%10;
			revnum=revnum*10+lDigit;
			n=n/10; 
		}
		if(revnum==tempn)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
