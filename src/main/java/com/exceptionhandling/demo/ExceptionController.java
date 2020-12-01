/**
 * 
 */
package com.exceptionhandling.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tenny
 *
 */
@RestController	
public class ExceptionController {
	
	@RequestMapping("api")
	public void message() throws CustomException{
		throw new CustomException();
		
	}

}
