package power1;

public class CheckPower {
	public int raiseToPower(int num,int n)
	{
		int finalresult=1;
		for(int i=1;i<=n;i++)
		{
			finalresult=finalresult*num;
			
		}
		return finalresult;
		
	}
	

}
