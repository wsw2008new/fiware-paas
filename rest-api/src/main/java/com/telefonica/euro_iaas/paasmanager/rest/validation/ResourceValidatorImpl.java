/**
 * (c) Copyright 2013 Telefonica, I+D. Printed in Spain (Europe). All Rights Reserved.<br>
 * The copyright to the software program(s) is property of Telefonica I+D. The program(s) may be used and or copied only
 * with the express written consent of Telefonica I+D or in accordance with the terms and conditions stipulated in the
 * agreement/contract under which the program(s) have been supplied.
 */

package com.telefonica.euro_iaas.paasmanager.rest.validation;

import com.telefonica.euro_iaas.commons.dao.InvalidEntityException;

/**
 * * @author Henar Munoz
 */
public class ResourceValidatorImpl implements ResourceValidator {

 
    
    /**
     * 
     */
    public void validateName (String name)  throws InvalidEntityException{
    	if (name == null) {
            throw new InvalidEntityException("The name is not valid. The name is null");
        }
    	
    	/*Names with characters other than [a-z], [0-9] or "-" (hyphen)*/
    	if (name.indexOf(".")!=-1 || name.indexOf("_") !=-1 || name.indexOf("-")!=-1) {
    		throw new InvalidEntityException("The name is not valid. There is a strange character");
    	}
    	/* Empty names ("")*/
    	if (name.length()==0) {
    		throw new InvalidEntityException("The name is not valid. It is empty");
    	}
    	
    	/*Missing names (the name is not even present in the XML/JSON)*/
    	
    	/*Names with more than 30 characters (i.e. 31 or more)*/
    	if (name.length()>=30) {
    		throw new InvalidEntityException("The name is not valid. The name has mor than 30 characteres");
    	}
  
    	
    }
    
    /**
     * 
     */
    public void validateDescription (String name)  throws InvalidEntityException{
    	
    	if (name == null) {
        
            throw new InvalidEntityException("The description is not valid. The description is null");
        }
    	
    	/* Empty descriptions ("")*/
    	if (name.length()==0) {
    		throw new InvalidEntityException("The description is not valid. It is empty");
    	}
    	
    	/*Missing descriptions (the name is not even present in the XML/JSON)*/
    	
    	/*Descriptions with more than 256 characters (i.e. 257 or more))*/
    	if (name.length()>=256) {
    		throw new InvalidEntityException("The description  is not valid. The name has mor than 256 characteres");
    	}
  
    	
    }


}