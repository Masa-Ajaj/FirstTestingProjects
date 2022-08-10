package com.account;

public class AccountNameValidate {
	   public Boolean validate(final String acName) {
         if (acName.substring(0,6).equals("Exalt_")) {
            return true;
         }
	      
	      return false;
	   }
		
}
