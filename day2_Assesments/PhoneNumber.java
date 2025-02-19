package day2;

public class PhoneNumber {
    private String areaCode;
    private String exchange;
    private String extension;
    
    public PhoneNumber(String areaCode, String exchange, String extension) {
		super();
		this.areaCode = areaCode;
		this.exchange = exchange;
		this.extension = extension;
	}

    @Override
	public String toString() {
    	return "(" + areaCode + ") " + exchange + "-" + extension;
    }
	


    public boolean equals(Object obj) {
        if (this == obj) {
            return true;  
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; 
        }
        PhoneNumber other = (PhoneNumber) obj;
        return areaCode.equals(other.areaCode) &&
               exchange.equals(other.exchange) &&
               extension.equals(other.extension); 
    }
}
