package com.spring.jdbc.xml.methods;

import java.util.List;
import java.util.Scanner;

import com.spring.jdbc.xml.dao.PhonepayMethod;
import com.spring.jdbc.xml.dao.PhonepayMethodImplemention;
import com.spring.jdbc.xml.entities.PhonePayTable;

public class MethodsBody {
	
	private static PhonepayMethod pm;

	public static PhonepayMethod getPm() {
		return pm;
	}

	public static void setPm(PhonepayMethod pm) {
		MethodsBody.pm = pm;
	}

	static Scanner scan = new Scanner(System.in);
	static PhonePayTable pt = new PhonePayTable();

	private PhonepayMethodImplemention methods;

	public PhonepayMethodImplemention getMethods() {
		return methods;
	}

	public void setMethods(PhonepayMethodImplemention methods) {
		this.methods = methods;
	}

	public String insert() {
		System.out.println("Enter the Id");
		int id = scan.nextInt();
		System.out.println("Enter the name");
		String name = scan.next();
		System.out.println("Enter the City");
		String city = scan.next();
		System.out.println("Enter the pin");
		int pin = scan.nextInt();
		pt.setId(id);
		pt.setName(name);
		pt.setCity(city);
		pt.setPin(pin);
		int insert = pm.insert(pt);
		return "Data is Inserted" + " " + insert;
	}

	public String updateById() {
		System.out.println("Enter the Id to change the data");
		int id = scan.nextInt();
		System.out.println("Enter the updated name");
		String name = scan.next();
		System.out.println("Enter the Updated city");
		String city = scan.next();
		System.out.println("Enter the Updated pin");
		int pin = scan.nextInt();

		pt.setId(id);
		pt.setName(name);
		pt.setCity(city);
		pt.setPin(pin);
		int i = pm.updateById(pt);
		return "Data is updated According to the" + " " + id + " " + i;

	}

	public String updateByName() {

		System.out.println("Enter the name Where the data have to update");
		String name = scan.next();
		System.out.println("Enter the updated Id");
		int id = scan.nextInt();
		System.out.println("Enter the Updated city");
		String city = scan.next();
		System.out.println("Enter the Updated pin");
		int pin = scan.nextInt();

		pt.setId(id);
		pt.setName(name);
		pt.setCity(city);
		pt.setPin(pin);
		int i = pm.updateByname(pt);
		return "Data is updated Acoording to the" + " " + name + " " + i;
	}

	public String updateByCity() {
		System.out.println("Enter the city name where the data have to change");
		String city = scan.next();
		System.out.println("Enter the  updated Id ");
		int id = scan.nextInt();
		System.out.println("Enter the updated name");
		String name = scan.next();
		System.out.println("Enter the Updated pin");
		int pin = scan.nextInt();
		pt.setId(id);
		pt.setName(name);
		pt.setCity(city);
		pt.setPin(pin);
		int i = pm.updateByCity(pt);

		return "Data is Updated Acoording to the" + " " + city + " " + i;
	}

	public String updateByPin() {
		System.out.println("Enter the pin where the data have to update");
		int pin = scan.nextInt();
		System.out.println("Enter the updated id");
		int id = scan.nextInt();
		System.out.println("Enter the updated name");
		String name = scan.next();
		System.out.println("Enter the Updated city");
		String city = scan.next();

		pt.setId(id);
		pt.setName(name);
		pt.setCity(city);
		pt.setPin(pin);

		int i = pm.updateByPin(pt);

		return "Data is updated Accoring to the" + " " + pin + " " + i;
	}

	public String deleteById() {
		System.out.println("Enter the Id where the data have to delete");
		int id = scan.nextInt();
		int byId = pm.delteById(id);
		return "Deleted Data By " + " " + id + " " + byId;
	}

	public String deleteByName() {
		System.out.println("Enter the Name where the data have to delete");
		String name = scan.next();
		int result = pm.deleteByName(name);
		return " Data is deleted by" + " " + name + " " + result;
	}

	public String deleteByCity() {
		System.out.println("Enter the city where the data have to delete");
		String city = scan.next();
		int byCity = pm.deleteByCity(city);
		return "Deleted data By" + " " + city + "" + byCity;
	}

	public String deleteByPin() {
		System.out.println("Enter the Pin where the data have to delete");
		int pin = scan.nextInt();
		int byPin = pm.deleteByPin(pin);
		return "Data is Deleted By" + " " + pin + " " + byPin;
	}

	public PhonePayTable getObject() {
		System.out.println("Enter the id to get the Object");
		int id = scan.nextInt();
		PhonePayTable result = pm.getObject(id);
		return result;
	}

	public List<PhonePayTable> getAll() {
		List<PhonePayTable> all = pm.getAll();
		for (PhonePayTable i : all) {
			System.out.println(i);
		}
		return all;

	}

}
