package com.xiehou.share.springboot.common.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Client
{
	public static void main(String[] args)
	{
		try
		{
			//ͨ������ʵ��������(���ַ�ʽ)
			Class<?> class1 = Class.forName("testTotal.reflect.Tiger");
			Class<?> class2 = Tiger.class;
			Class<?> class3 = new Tiger().getClass();
			//�õ�����������
			Constructor<?> cons[] = class1.getConstructors();
			//�õ���������
			Method method[] = class1.getMethods();
			//�õ���������
			Field field[] = class1.getFields();
			//��������ʽ����ʵ�ֵ�ȫ���ӿ�
			Class<?> c[] = class1.getInterfaces();
			//�õ��ӿ��еķ���
			Method[] interfaceMethod = c[0].getMethods();
			//�õ��̳еĸ���
			Class<?> superClass = class1.getSuperclass();

			System.out.println(class1);
			System.out.println(class2);
			System.out.println(class3);
			System.out.println(cons[1]);
			System.out.println(method[1]);
			System.out.println(field[1]);
			System.out.println(c[0]);
			System.out.println(interfaceMethod[1]);
			System.out.println(superClass);
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
