package quiz.Q2_ArrayList;

import java.util.*;
public class CustManager extends Customer{  //controller
	//
	ArrayList<Customer> list = new ArrayList<Customer>();
	
	//
	CustManager(){	}
	CustManager(String name, String add, String tel){  // �������Լ� ����� ȣ�� �Ұ��� - 1ȸ ȣ���
		Customer c = new Customer(name, add, tel);
		list.add(c);
	}
	
	//
	public void CustomerAdd(String name, String add, String tel){  //�߰�
		Customer c = new Customer(name, add, tel);
		list.add(c);
	}
	
	public void CustomerRmv(int i){   // ����
		System.out.println("\n\n* ������ ��");
		list.get(i-1).display();
		System.out.println("--------------");
		list.remove(i-1);
	}
	
	public void CustomerCh(int i, String name, String add, String tel){  // ����
		Customer c = new Customer(name, add, tel);
		list.set(i-1, c);  // ��ü
	}
	
	public void display(){
		System.out.println("����� �� �� : " + list.size());
		for(int i=0; i<list.size(); i++){
			System.out.println();
			System.out.println("- " + (i+1) + "�� -");
			list.get(i).display();
		}// for
	}// display()
}// CustomerManager
