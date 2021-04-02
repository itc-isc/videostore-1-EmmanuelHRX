package wsVideoStore;

public abstract class Movie
{
	private String title;
	private int priceCode;
	private final int REGULAR = 1;
	private final int NEW_RELEASE = 2;
	private final int CHILDRENS = 3;


	public Movie(String title, int priceCode) {
		this.title 		= title;
		this.priceCode 	= priceCode;
	}
		
	public String getTitle () {
		return title;
	}

	public int getPriceCode() {
		return priceCode;
	}

  public abstract double determineAmount(int daysRented);

  public abstract int determineFrequentRenterPoints(int daysRented);

}