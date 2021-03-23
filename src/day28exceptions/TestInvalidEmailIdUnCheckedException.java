package day28exceptions;

public class TestInvalidEmailIdUnCheckedException {

	public static void main(String[] args) {
		
		try {
			
			validateEmailId("abc@xmail.com");
			
		}catch(InvalidEmailIdUnCheckedException e){
			
			System.out.println(e.getMessage());
			
		}
		
	}
	
	public static void validateEmailId(String emailId) {
		
		if(emailId.contains("@gmail.com") || emailId.contains("@yahoo.com")) {
			System.out.println(emailId);
		}else {
			throw new InvalidEmailIdUnCheckedException("Email id is invalid");
		}
		
	}

}
