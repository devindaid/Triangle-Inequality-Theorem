public class LineReal {

    // Create the variables for the x and y components of the 2 points of a line
    private double x1 ,y1, x2, y2;

    // Constructor
    public LineReal(PointReal p1, PointReal p2) {
        this.x1 = p1.getxcomponent(); // Sends the x value of point 1 into the private variable x1
        this.y1 = p1.getycomponent(); // Sends the y value of point 1 into the private variable y1
        this.x2 = p2.getxcomponent(); // Sends the x value of point 2 into the private variable x2
        this.y2 = p2.getycomponent(); // Sends the y value of point 2 into the private variable y2
    }

    // Calculate the length of the line using the
    // provided equation for the distance between 2 points
    public double getLength() {
        double deltax = Math.pow(x2-x1, 2);
        double deltay = Math.pow(y2-y1, 2);
        double length = Math.sqrt(deltax + deltay);

        return length; // Returns the length of the line
    }

}
