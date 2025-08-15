package co.unicauca.figures.domain;

/**
 *
 * @author Valentina
 */
public class Square implements Figure{
    private double side;
    public Square (double side){
        this.side = side;
    }
    
    /**
     * @return the side
     */
    public double getSide() {
        return side;
    }

    /**
     * @param side the side to set
     */
    public void setSide(double side) {
        this.side = side;
    }
    
    @Override
    public double calculatePerimeter() {
        return 4*side; 
    }

    @Override
    public double calculateArea() {
        return side*side;
    }
    
}
