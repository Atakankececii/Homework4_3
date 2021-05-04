package Concrete;

import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;

public class CustomerManager implements ICustomerService{

	
	private ICustomerCheckService customerCheckService;
	 
	public CustomerManager(ICustomerCheckService customerCheckService) {
	        this.customerCheckService = customerCheckService;
	    }
	
	@Override
	public void add(Customer customer) {
		 if (customerCheckService.CheckIfRealPerson(customer)) {
	            System.out.println(customer.getFirstName()+" "+customer.getLastName()+" sisteme kaydedilmi�tir.");
	        }else {
	            try {
	                throw new Exception(customer.getFirstName() + " " + customer.getLastName() + " Not a valid person");
	            }
	            catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }
		
	}

	@Override
	public void update(Customer customer) {
		 if (customerCheckService.CheckIfRealPerson(customer)) {
	            System.out.println("----------");
	        }else {
	            try {
	                throw new Exception(customer.getFirstName() + " " + customer.getLastName() + " Not a valid person");
	            }
	            catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }
		 
		  if (customer.getFirstName() != null && customer.getLastName() !=null && customer.getNationalityId().length() ==11)
	                {
	            System.out.println(customer.getFirstName()+customer.getLastName() + "kullan�c�m�z �zellikleriniz kontrol edilip g�ncellenmi�tir.");
	        }else{
	            System.out.println("Bir daha kontrol ediniz.");
	        }
		
	}

	@Override
	public void delete(Customer customer) {
		 if (customerCheckService.CheckIfRealPerson(customer)) {
	            System.out.println(customer.getFirstName()+" "+customer.getLastName()+" kullan�c�m�z sistemden silinmi�tir.");
	        }else {
	            try {
	                throw new Exception(customer.getFirstName() + " " + customer.getLastName() + " Not a valid person");
	            }
	            catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }
		 
		
	}

	@Override
	public void show(Customer customer) {
		System.out.println("Oyuncunun ad�:"+customer.getFirstName()+"\n"+"Oyuncunun soyad�:"
	+customer.getLastName()+"\n"+"Oyuncunun do�um tarihi:"+customer.getDateOfBirth());
		
	}

	

}
