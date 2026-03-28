package com.example.controller;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api")
public class RewardsController {
	 @GetMapping("/getrewards/customer")
	    public int  home(int amt) {
		 
		 
		for(int i=1;i<=3;i++)
		{switch (amt)
			{
		case amt  between 0 and 100 :
			
			rewardpoints=1*50;
			}
		
		case amt between 100 and above 
		{rewardpoint=rewardpoints+2*50;}
			return rewardpoints;
	       
	    }
}
