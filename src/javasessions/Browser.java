package javasessions;

public class Browser 
{
	boolean flag=true;
	public boolean launchBrowser(String broserName)
	{
		if(broserName.equals("chrome"))
		{
			System.out.println("chrome browser is launched");
			System.out.println(flag);
			return flag;
		}
		else if(broserName.equals("ff"))
		{
			System.out.println("ff browser is launched");
			return flag;
		}
		else if(broserName.equals("safari"))
		{
			System.out.println("safari browser is launched");
			return flag;
		}
		else if(broserName.equals("ie"))
		{
			System.out.println("ie browser is launched");
			return flag;
		}
		else
			System.out.println("Please provide right browser");
		return flag=false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser b=new Browser();
		boolean f=b.launchBrowser("chrome");

	}

}
