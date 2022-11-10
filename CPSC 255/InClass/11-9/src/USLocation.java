
public class USLocation {
	private String town;
	private String state;
	
	public USLocation(String town, String state) {
		this.town = new String(town);
		this.state = new String(state);
	}
	
	/**
	 * @return the town
	 */
	public String getTown() {
		return town;
	}

	/**
	 * @param town the town to set
	 */
	public void setTown(String town) {
		this.town = town;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	public String toString() {
		return this.town + " in the state of "+ this.state;
	}

	public boolean equals(Object o)
	{	USLocation param = (USLocation) o;
		if (! this.town.equals(param.town))
			return false;
		if (! this.state.equals(param.state))
			return false;
		return true;
	}
	

}
