package prob03;

public class Money {

	private int amount;
    
    public Money(int amount) {
    	this.amount = amount;
    }
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}

	public Object add(Money money) {
    	return new Money( this.amount + money.amount  );    	
    }

	public Object minus(Money money) {
    	return new Money( this.amount - money.amount  );  
	}

	public Object multiply(Money money) {
    	return new Money( this.amount * money.amount  );
	}

	public Object devide(Money money) {
    	return new Money( this.amount / money.amount  );
	}
}
