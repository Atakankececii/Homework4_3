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
	            System.out.println(customer.getFirstName()+" "+customer.getLastName()+" sisteme kaydedilmiştir.");
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
	            System.out.println(customer.getFirstName()+customer.getLastName() + "kullanıcımız özellikleriniz kontrol edilip güncellenmiştir.");
	        }else{
	            System.out.println("Bir daha kontrol ediniz.");
	        }
		
	}

	@Override
	public void delete(Customer customer) {
		 if (customerCheckService.CheckIfRealPerson(customer)) {
	            System.out.println(customer.getFirstName()+" "+customer.getLastName()+" kullanıcımız sistemden silinmiştir.");
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
		System.out.println("Oyuncunun adı:"+customer.getFirstName()+"\n"+"Oyuncunun soyadı:"
	+customer.getLastName()+"\n"+"Oyuncunun doğum tarihi:"+customer.getDateOfBirth());
		
	}

	

}
