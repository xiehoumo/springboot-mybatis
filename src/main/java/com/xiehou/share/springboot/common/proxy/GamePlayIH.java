package com.xiehou.share.springboot.common.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ��̬����ʵ��
 *
 * */
public class GamePlayIH implements InvocationHandler
{
	//��������
	Class<?> class1 = null;
	//������Ķ���
	Object object = null;
	//Ҫ����˭

	public GamePlayIH(Object object)
	{
		this.object = object;
	}

	//���ñ�����ķ���
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable
	{
		//�������ӵĹ���
		if(method.getName().equalsIgnoreCase("login"))
		{
			System.out.println("����˺��ڱ𴦵�¼");
		}

		Object result = method.invoke(this.object, args);

		return result;
	}
}