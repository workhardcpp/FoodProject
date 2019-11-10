package data;

public interface Food {
	
	public String getName();
	
	public double getWeight();

	public String getImageURL();

	public void setImageURL(String imageURL);

	public void setWeight(double weight);

	public void setName(String name);

	public double getCalorie ();

	public double getCalorie_g();

	public void setCalorie_g(double calorie_g);
	

}
