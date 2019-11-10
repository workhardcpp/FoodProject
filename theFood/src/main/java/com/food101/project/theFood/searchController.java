package com.food101.project.theFood;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;

import data.foodRecipe;

@Controller
public class searchController {

	@RequestMapping("home")
    public String index(
        @RequestParam(value = "search", required = true) String searchInput,
        Model model
    ) {
		List<foodRecipe> l = performSearch(searchInput);
		String[] inputItems = searchInput.split(",");
		
		
		
		
		model.addAttribute("userIds", inputItems);
		
		
		
		return "home";
    }
	
	private List<foodRecipe> performSearch(String s) {
		
		List<foodRecipe> l = new ArrayList<foodRecipe>();
		
		String[] inputItems = s.split(",");
		
		Firestore db = FirestoreClient.getFirestore();
		
		
		
		
		
		
		return l;
	}

   

}
