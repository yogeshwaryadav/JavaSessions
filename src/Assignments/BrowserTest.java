package Assignments;

public class BrowserTest {

	public static void main(String[] args) 
	{
		String[]plugin=new String[2];
		plugin[0]="adbloker";
		plugin[1]="chropath";
		Browser br=new Browser("Google",80.01,plugin);
		System.out.println(br.getName());
		System.out.println(br.getVersion());
		String[]plugin1=br.getPlugin();
		for(String e:plugin)
		{
			System.out.println(e);
		}
		

	}

}
