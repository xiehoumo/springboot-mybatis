package pattern.proxy;

public class GamePlayer implements IGamePlayer
{
	private String name = "";

	public GamePlayer(String name)
	{
		this.name = name;
	}

	public void login(String user, String password)
	{
		System.out.println("用户"+user+"登录，"+this.name+"登录成功");
	}

	public void killboss()
	{
		System.out.println(this.name+"在打怪");
	}

	public void upgrade()
	{
		System.out.println(this.name+"升了一级");
	}
}