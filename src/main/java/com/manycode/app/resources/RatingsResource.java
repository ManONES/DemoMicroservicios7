package com.manycode.app.resources;

import com.manycode.app.model.UserRating;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value = "/ratingsdata")
public class RatingsResource {

	private static Logger LOG = LoggerFactory.getLogger(RatingsResource.class);

    @RequestMapping("/user/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
    	int iii = 0;      
		for (int ii = 0; ii < 10; ii++) {
	        while (true) {
			    iii =getRandomNumberInRange(1, 20000);
			    LOG.info("intento:" + iii);
	            if (iii==1974) { break;}
	        }
		}        	
    	
    	
        UserRating userRating = new UserRating();
        userRating.initData(userId + ":" +iii);
        return userRating;

    }
    

    @RequestMapping("/user2/{userId}")
    public UserRating getUserRatings2(@PathVariable("userId") String userId) {
        UserRating userRating = new UserRating();
        userRating.initData2(userId);
        return userRating;

    }    
    
    
    @GetMapping(value ="/testdestino")
	public String welcome() {
		return "Hola al mundo de Many  con  microservicios 1841";
	}	
    
	private static int getRandomNumberInRange(int min, int max) {
		
		Random r = new Random();
		return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
		
	}	
    
    
    
}