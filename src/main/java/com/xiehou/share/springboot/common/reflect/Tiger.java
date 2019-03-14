package com.xiehou.share.springboot.common.reflect;

public class Tiger extends Animal implements Ibehavior
{
	public Tiger()
	{
		
	}

	public Tiger(String name, int weight)
	{
		super(name, weight);
	}

	@Override
	public void eat(String something)
	{
		System.out.println("��Ҫ�Է�");
	}

	@Override
	public void sleep()
	{
		System.out.println("��Ҫ˯��");
	}
	
	public void killSmallAnimals()
	{
		System.out.println("�����ܿ�");
	}
}
