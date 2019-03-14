package com.xiehou.share.springboot.common.proxy;

public class GamePlayer implements IGamePlayer
{
	private String name = "";

	public GamePlayer(String name)
	{
		this.name = name;
	}

	public void login(String user, String password)
	{
		System.out.println("�û�"+user+"��¼��"+this.name+"��¼�ɹ�");
	}

	public void killboss()
	{
		System.out.println(this.name+"�ڴ��");
	}

	public void upgrade()
	{
		System.out.println(this.name+"����һ��");
	}
}