package inheritence.multipleinheritence;

public class TaxCalculator implements StateTax,CentralTax {
	public void roadTax() {
		System.out.println("road tax of Central tax");
	}
	public void waterTax() {
		System.out.println("road tax of State tax");
	}
	
	
	}


