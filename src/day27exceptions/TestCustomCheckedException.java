package day27exceptions;

public class TestCustomCheckedException {

	public static void main(String[] args) throws InvalidEmailIdCheckedException {
		
//		try {
//			validateEmailId("123456789");
//		} catch (InvalidEmailIdCheckedException e) {
//			System.out.println(e.getMessage());
//		}
		
		validateEmailId("123456789");

	}
	
	public static void validateEmailId(String id) throws InvalidEmailIdCheckedException {
		if(id.length()>8) {
			throw new InvalidEmailIdCheckedException("Student id has more than 8 characters");
		}else{
			System.out.println(id);
		}
	}

}
