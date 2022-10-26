
/*
 * A class to record the name and length in minutes of a movie and year of release.
 */
public class Movie implements Comparable<Movie> {
	private String name;
	private int numberOfMinutes;
	private int yearOfRelease;

	public Movie(String name, int numberOfMinutes, int year) {
		super();
		this.name = name;
		this.numberOfMinutes = numberOfMinutes;
		this.yearOfRelease = year;
	}
	
	@Override
	public String toString() {
		return "The Movie '" + name + "' released in " + yearOfRelease + " is " + numberOfMinutes + " minutes long.";
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) 
			return true;
		if (! (other instanceof Movie)) 
			return false;

		Movie temp = (Movie) other;

		if (!temp.name.equals(this.name))
			return false;
		else if (!(temp.numberOfMinutes == this.numberOfMinutes))
			return false;
		else if (!(temp.yearOfRelease == this.yearOfRelease))
			return false;
		else return true;
	}

	@Override
	public int compareTo(Movie other) {
		int rtr = this.yearOfRelease > other.yearOfRelease ? 1 : -1;
		if (this.yearOfRelease == other.yearOfRelease) 
			rtr = this.name.compareTo(other.name);
		return rtr;
	}
	
}
