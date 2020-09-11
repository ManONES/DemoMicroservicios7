package com.manycode.app.resources;

import com.manycode.app.model.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value = "/ratingsdata")
public class RatingsResource {



    @RequestMapping("/user/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
        UserRating userRating = new UserRating();
        userRating.initData(userId);
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
    
    
    
}