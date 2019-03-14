package pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client
{
	/**
	 * 场景类
	 * @param args
	 */
	public static void main(String[] args)
	{
		//定义一个游戏玩家
		IGamePlayer player = new GamePlayer("zhangsan");
		
		//定义一个handler（动态代理）
		InvocationHandler handler = new GamePlayIH(player);
		
		//获得类的class loader
		ClassLoader cl = player.getClass().getClassLoader();
		
		System.out.println(cl);
		
		IGamePlayer proxy = 
			(IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
		
		proxy.login("zhangsan", "password");
		proxy.killboss();
		proxy.upgrade();
	}
}