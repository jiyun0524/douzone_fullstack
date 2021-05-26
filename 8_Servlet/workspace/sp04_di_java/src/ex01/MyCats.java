package ex01;

public class MyCats {
	
	Cats cats;
	private String firstCatName;
	private int firstCatAge;
	private String secondCatName;
	private int secondCatAge;
	
	public void catsNameInfo() {
		cats.catsName(firstCatName, secondCatName);
	}
	
	public void catsAgeInfo() {
		cats.catsAge(firstCatAge, secondCatAge);
	}

	public Cats getCats() {
		return cats;
	}

	public void setCats(Cats cats) {
		this.cats = cats;
	}

	public String getFirstCatName() {
		return firstCatName;
	}

	public void setFirstCatName(String firstCatName) {
		this.firstCatName = firstCatName;
	}

	public int getFirstCatAge() {
		return firstCatAge;
	}

	public void setFirstCatAge(int firstCatAge) {
		this.firstCatAge = firstCatAge;
	}

	public String getSecondCatName() {
		return secondCatName;
	}

	public void setSecondCatName(String secondCatName) {
		this.secondCatName = secondCatName;
	}

	public int getSecondCatAge() {
		return secondCatAge;
	}

	public void setSecondCatAge(int secondCatAge) {
		this.secondCatAge = secondCatAge;
	}
	
	
}








