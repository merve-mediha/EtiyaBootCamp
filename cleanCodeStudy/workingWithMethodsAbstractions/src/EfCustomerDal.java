

public class EfCustomerDal  implements CustomerDal{

	public void add(Customer customer) {
		System.out.println("Entity Framework kullanarak veritabanưna eklendi");
		
	}

	@Override
	public boolean customerExists(Customer customer) {
	
		return false;
	}

	

}
