package dataAccess.concretes.entityFramework;

import dataAccess.abstracts.ICustomerDal;
import entities.concretes.Customer;

public class EfCustomerDal implements ICustomerDal{
	
	

	@Override
	public void add(Customer customer) {
		System.out.println("Müşteri Entity Framework ile veritabanına eklendi");
		
	}

	@Override
	public boolean checkCustomerExists(Customer customer) {
		return true;
	}

}
