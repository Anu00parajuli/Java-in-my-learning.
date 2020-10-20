class IfElseStatement{
	 public static void main(String[] args) {
	 	int marks = 65;
	 	if ( marks < 40 ) {
	 		System.out.Println("Fail");
	 	    }
	 		else if ( marks >= 40 && marks < 50) {
	 		  System.out.Println("3rd division");	
	 		}
	 		else if ( marks >= 50 && marks < 60) {
	 		  System.out.Println("2nd division");	
	 		}
	 		else if ( marks >= 60 && marks < 70) {
	 		  System.out.Println("1st division");	
	 		}
	 		else if ( marks >= 70 && marks < 100) {
	 		  System.out.Println("Distinction");	
	 		}
	 		else{
	 			System.out.Println("Wrong info please");
	 		}
	 	 
		
	} //main
} //class