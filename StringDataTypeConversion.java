package com.vstl.javatraining;

public class StringDataTypeConversion {
		
		//String to Integer
		public void girlsMarriageAge(String strAge) {
			int intAge = 18;
			int intConvertedAge = Integer.parseInt(strAge);
			
			if(intConvertedAge > intAge) {
				System.out.println("The girl is eligible for marriage");
			}
			else {
				System.out.println("The girl si not eligible for the marrige");
			}
		}

		//String to double
			public void govertPSIExamCutOff(String strMarks) {
				String doubleMarks = "40.5";
			    double doubleConvertedMarks = Double.parseDouble(strMarks);
			
			    if(doubleConvertedMarks > 40.5) {
			    	System.out.println("The candidate is eligible");
			}
			    else {
			    	System.out.println("The candidate is not eligible");
			    }
				
			}
			
		//String to boolean
			
			public void hdfcBankGivingLoan(String strLoan) {
				String booleanHomeLoan = "true";
				String booleanCarLoan = "true";
				String booleanPersonalLoan = "false";
				
			    boolean booleanConvertedHomeLoan = Boolean.parseBoolean(booleanHomeLoan);
			    boolean booleanConvertedCarLoan = Boolean.parseBoolean(booleanCarLoan);
			    boolean booleanConvertedPersonalLoan = Boolean.parseBoolean(booleanPersonalLoan);
			    
			    System.out.println("The customer is elible for HomeLoan:"+booleanConvertedHomeLoan);
			    System.out.println("The customer is elible for CarLoan:"+booleanConvertedCarLoan);
			    System.out.println("The customer is elible for PersonalLoan:"+booleanConvertedPersonalLoan);
			}
			
			
		//string to char
			
			public void belgaumDistrictUnivercity(String strUnivercity) {
				String charUnivercity = "Rani Chennamma Univercity";
				char charConvertedUnivercity = charUnivercity.charAt(5);
				
				System.out.println("5th letter of sentence is: " +charConvertedUnivercity);
				
	}
	}
