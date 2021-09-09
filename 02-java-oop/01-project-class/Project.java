// ● Create getter and setters for each field

// ● Create a ProjectTest file that will test all the functionality.

// Optional Challenges:
// ● Add an additional initialCost member variable that is of type double and has both getters and setters

// ● Add this to the elevator pitch in parentheses after the name, e.g.: name (cost): description

// ● Create a Portfolio class that will keep an ArrayList of Project in the field projects. Use generics to ensure these are Project objects.

// ● Add the appropriate getters/setters/constructors for this class to work

// ● Add the getPortfolioCost method that calculates and returns the cost to buy the entire portfolio.
// ● Add the showPortfolio method that will print all the project elevator pitches, followed by the total cost.

// ● Create a Project class that has the fields of name and description.
public class Project {
    private String name;
    private String description;
    
    private double initialCost = 0;
    private static String defaultName = "Default NAME";
    private static String defaultDescription = "Default DESCRIPTION";
    // ● Create an instance method called elevatorPitch that 
    // will return the name and description separated by a colon.
    public String getName(){return name;}
    public String getDescription(){return description;}
    public double getCost(){return initialCost;}
    public void setName(){this.name = name;}
    public void setDescription(){this.description = description;}
    public String elevatorPitch(){
        return String.format("%s (%02f) %s", name, initialCost,description);
    }

    // ● Overload the constructor method in three different ways.
    // public Project() {}
    public Project(){
        name = defaultName;
        description = defaultDescription;
    }
    // public Project(String name) {}
    public Project(String name){
        this.name = name;
        description = defaultDescription;

    }
    // public Project(String name, String description) {}
    public Project(String name,String description, double cost){
        this.name = name;
        this.initialCost = cost;
        this.description = description;   
    }



}