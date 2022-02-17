package javasessions;

public class BrowserUsingSwitchcase {

	
	public boolean launchBrowser(String browserName)
	{
		switch(browserName)
		{
		case "chrome":
			System.out.println("launch chrome browser");
			return true;
			
		case "ff":
			System.out.println("launch ff browser");
			return true;
			
		case "safari":
			System.out.println("launch safari browser");
			return true;
			
		case "ie":
			System.out.println("launch ie browser");
			return true;
			
		default :
			System.out.println("Please provide right browser");
			return false;
			
		}
	}	
	
	
	
	
	public static void main(String[] args) 
	{
		
		BrowserUsingSwitchcase br=new BrowserUsingSwitchcase();
		if(br.launchBrowser("opera"))
		{
			System.out.println("Chrome is launched");
		}
		else
		{
			System.out.println("TC is failed");
		}
	}

}
