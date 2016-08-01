package webapp;

public class UserValidationService {

	String name = "Rajesh";
    String password	= "dummy";
    
    public boolean isUserValid(String _name, String _password){
    	
    	if(name.equals(_name) && password.equals(_password)){
    		return true;
    	}
    
         return false;
    }
}
