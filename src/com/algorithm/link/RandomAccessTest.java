package com.algorithm.link;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class RandomAccessTest {
	 public static void travel(List list)
	    {
	        if (list instanceof RandomAccess)
	        {
	            System.out.println("ʵ����RandomAccess�ӿڣ���ʹ�õ�������");
	            for(int i=0;i<list.size();i++)
	            {
	                System.out.println(list.get(i));
	            }
	        }
	        else
	        {
	            System.out.println("ûʵ��RandomAccess�ӿڣ�ʹ�õ�������");
	            for (Iterator iter = list.iterator(); iter.hasNext();)
	            {
	                System.out.println((String) iter.next());
	            }
	        }
	    }

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		travel(list);
		list = new LinkedList();
		list.add("c");
		list.add("d");
		travel(list);
	}
}
