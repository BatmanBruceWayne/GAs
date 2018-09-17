package GAobjects;
import java.lang.Math;

public class Individual {
	private City[] cities;
	private double cycle = -1;
	
	public Individual(City[] cities) {
		this.cities = cities;
	}
	
	public double getCycle() {
		double result = 0;
		for(int i=0; i<cities.length; i++) {
			double distance = getDistance(cities[i], cities[i+1]);
			result += distance;
		}
		result += getDistance(cities[0], cities[cities.length-1]);
		return result;
	}
	
	public double getDistance(City city1, City city2) {
		return Math.sqrt(Math.pow(city1.getX() - city2.getX(), 2) - Math.pow(city1.getY() - city2.getY(), 2));
	}
}
