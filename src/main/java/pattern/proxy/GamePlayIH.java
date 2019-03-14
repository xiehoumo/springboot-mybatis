package pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理实现
 *
 * */
public class GamePlayIH implements InvocationHandler
{
	//被代理者
	Class<?> class1 = null;
	//被代理的对象
	Object object = null;
	//要代理谁

	public GamePlayIH(Object object)
	{
		this.object = object;
	}

	//调用被代理的方法
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable
	{
		//额外增加的功能
		if(method.getName().equalsIgnoreCase("login"))
		{
			System.out.println("你的账号在别处登录");
		}

		Object result = method.invoke(this.object, args);

		return result;
	}
}