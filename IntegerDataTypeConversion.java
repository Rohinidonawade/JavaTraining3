package com.vstl.javatraining;

public class IntegerDataTypeConversion {
	
	//Integer to String
	
	public void boysMarriageAge(Integer IntAge) {
		String strAge = "21";
	    String strConvertedAge = String.valueOf(IntAge);
				
	    if(strConvertedAge.equals(strAge)) {
			System.out.println("The boy is eligible for marriage");
		}
		else {
			System.out.println("The boy is not eligible for the marrige");
		     }
	   }
	
	//Integer to double
	
	public void BangloreCityTemperature(Integer IntegerTemp) {
		double doubleTemp = 27;
	    double doubleConvertedTemp = Double.valueOf(doubleTemp);
	    
	    if(doubleConvertedTemp > doubleTemp) {
	    	System.out.println("The Temperature is normal");
	    }
	    else {
	    	System.out.println("The Temperature is not normal");
	         }
	    }
	
	//Integer to char [char c = (char)i]//i is integer value declared
	
	public void puneCityTotalHospital(char charTotalHospital) {
		int intShivajiNagarHospital = 23;
		int intRajajiNagarHospital = 30;
		int intVijayNagarHospital = 35;
		int totallHospitalsInPune = intShivajiNagarHospital+intRajajiNagarHospital+intVijayNagarHospital;
	    char charConvertedTotalHospital = (char)totallHospitalsInPune;
	    
	   if(charConvertedTotalHospital > totallHospitalsInPune) {
		   System.out.println("The Hospitals in Pune is less"); 
	   }
	   else {
		   System.out.println("The Hospitals in Pune is more");
	   }
	    }
}
