package VoterAge;

public class NotEligibleToVoteException extends Exception { // Creating NotEligibleToVoteException class
	int age; //Declaring variable age
	// making a constructor
	  public  void NotEligibleToVoteException(int age){ // Creating NotEligibleToVoteException method 
		  
		  this.age =age; 
		}
      public String toString(){
    	  return " Your age must be 18+."; // Returning value 
	}

}
