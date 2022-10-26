
public class USLocation implements Comparable<USLocation>{
	private String town;
	private String state;
	
	public USLocation(String town, String state) {
		this.town = town;
		this.state = state;
	}
	
	public String toString() {
		return this.town + " in the state of "+ this.state;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) 
			return true;
		if (! (other instanceof USLocation)) 
			return false;

		USLocation temp = (USLocation) other;

		if (!temp.town.equals(this.town))
			return false;
		else if (!(temp.state.equals(this.state)))
			return false;
		else return true;
	}

	@Override
	public int compareTo(USLocation other){
		int rtr = this.state.compareTo(other.state);
		if (rtr == 0) 
			return (this.town.compareTo(other.town));
		else return rtr;
	}


}
