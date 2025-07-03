public class PointReal {

    // Create the variables that will hold the x and y values inputted by the user
    private double x, y;

    // Constructor
    public PointReal(double x, double y) {
        this.x = x; // Sends the x value inputted by the user to the private variable x
        this.y = y; // Sends the y value inputted by the user to the private variable y
    }

    // Get the x value of a point
    public double getxcomponent() {
        return this.x; // Returns the x value of a point
    }

    // Get the y value of a point
    public double getycomponent() {
        return this.y; // Returns the y value of a point
    }

}
