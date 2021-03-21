package day27exceptions;

public class TestCustomUnCheckedException {

	public static void main(String[] args){
		
//		try {
//			validateStudentId("abc!gmail.com");
//		} catch (InvalidEmailIdUnCheckedException e) {
//			System.out.println(e.getMessage());
//		}
		
		validateEmailId("abc@gmail.com");
		validateEmailId("abc!gmail.com");

	}
	
	//Notice that we did not have to use the "throws" keywords at the method signature since it is an unchecked exception.
	public static void validateEmailId(String id){
		if(!id.contains("@")) {
			throw new InvalidEmailIdUnCheckedException("Email id must have @");
		}else{
			System.out.println(id);
		}
	}

}
