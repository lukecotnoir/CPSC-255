// Shelves have a material, a length, and a number of supports that are added to the shelf.
// if a length is not specified, it is assumed to be 3 feet
// Initially, there are 0 supports for each shelf.
public class Shelf {
	private String material;
	private int length = 3;
	private int supports = 0;
	
	public Shelf(String material) {
		this.setMaterial(material);
	}
	
	public Shelf(String material, int length) {
		this.setMaterial(material);
		this.setLength(length);
	}

	public String getMaterial() {
		return material;
	}
	
	public void addSupports(int supports) {
		this.supports += supports;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getSupports() {
		return supports;
	}

	public void setSupports(int supports) {
		this.supports = supports;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public String toString() {
		return ("A shelf made of " +material+ ", length=" +length+ ", with " +supports+ " supports");
	}
	
	
	
}
