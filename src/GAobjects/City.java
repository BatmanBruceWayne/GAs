package GAobjects;

public class City {
	private String name;
	private double x, y;
	public City (String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName () {
        return name;
    }

    public double getX () {
        return x;
    }

    public double getY () {
        return y;
    }
}
