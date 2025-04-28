
/**
 * Class to represent individual race participants as horses
 * 
 * @author Abdul Moiz Khan
 * @version 1.0.2
 */
public class Horse
{
    //Fields of class Horse

    String name;
    char symbol;
    double confidence;
    boolean fallen;
    int DistanceTravelled;
    
    
      
    //Constructor of class Horse
    /**
     * Constructor for objects of class Horse
     */
    public Horse(char horseSymbol, String horseName, double horseConfidence)
    {
       this.symbol = horseSymbol;
       this.name = horseName;
       this.setConfidence(horseConfidence);
       this.DistanceTravelled = 0;
       this.fallen = false;

    }
    
    
    
    //Other methods of class Horse
    public void fall() // Sets horse as fallen
    {
        this.fallen = true;
    }
    
    public double getConfidence() // Returns horse confidence rating
    {
        return this.confidence;
    }

    public void setConfidence(double confidence) // Ensure confidence is within a 0 and 1
    { 
        if (confidence > 1) {
            this.confidence = 1;
        }
        else if (confidence < 0) {
            this.confidence = 0;
        }
        else {
            this.confidence=confidence;
        }
    }
    
    public int getDistanceTravelled() // Returns distance travelled by horse
    {
        return this.DistanceTravelled;
    }
    
    public String getName() // Returns horse name
    {
        return this.name;
    }
    
    public char getSymbol() // Returns horse symbol
    {
        return this.symbol;
    }
    
    public void goBackToStart() // Resets the horse to the start of the race
    {
        this.DistanceTravelled = 0; //?
        this.fallen = false;
    }
    
    public boolean hasFallen() // Returns true if horse has fallen, false otherwise
    {
        return this.fallen;
    }

    public void moveForward() // Increments the distance travelled by the horse by 1
    {
        this.DistanceTravelled += 1;
    }
    
    public void setSymbol(char newSymbol) // Sets horse symbol to given character
    {
        this.symbol = newSymbol;
    }
    
}
