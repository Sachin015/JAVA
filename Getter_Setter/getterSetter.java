class GetterSetter { 
	// private = restricted access 
	private String name; 

	// Getter is use to return value 
	public String getName() { 
        return name;
    
    } 

	// Setter is use to set the value 
	public void setName(String newName) 
	{ 
		this.name = newName; // this is use to point out , setting value into name variable
	} 
} 

class Main { 
	public static void main(String[] args) 
	{ 
		GetterSetter person = new GetterSetter(); 
		// Set the value of the name variable to "Sachin" 
		person.setName("Sachin"); 
		System.out.println(person.getName()); 
	} 
}
