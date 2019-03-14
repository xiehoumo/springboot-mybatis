package com.xiehou.share.springboot.common.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client
{
	/**
	 * ������
	 * @param args
	 */
	public static void main(String[] args)
	{
		//����һ����Ϸ���
		IGamePlayer player = new GamePlayer("zhangsan");
		
		//����һ��handler����̬����
		InvocationHandler handler = new GamePlayIH(player);
		
		//������class loader
		ClassLoader cl = player.getClass().getClassLoader();
		
		System.out.println(cl);
		
		IGamePlayer proxy = 
			(IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
		
		proxy.login("zhangsan", "password");
		proxy.killboss();
		proxy.upgrade();
	}
}