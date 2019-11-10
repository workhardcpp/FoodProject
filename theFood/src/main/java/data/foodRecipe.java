package data;

import java.util.List;

public class foodRecipe {
	
	private List<Food> ingredient;
	
	private String Description;
	
	public foodRecipe(List<Food> food, String descp){
		
		ingredient = food;
		
		Description = descp;
	}

	public List<Food> getIngredient() {
		return ingredient;
	}

	public void setIngredient(List<Food> ingredient) {
		this.ingredient = ingredient;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

}
