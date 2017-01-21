/**
 * A book with a title and a price
 * 
 * @author Ian Duron
 */
public class Book
{
    private String title;
    private double price;
    
    /**
     * Constructor for the Book class
     * @param title the title of the book
     * @param price the price of the book
     */
    public Book(String title, double price)
    {
        this.title = title;
        this.price = price;
    }
    
    /**
     * @param newTitle sets the title of the book
     */
    public void setTitle(String newTitle)
    {
        this.title = newTitle;
    }
    
    /**
     * @param priceOfBook sets the price of the book
     */
    public void setPrice(double priceOfBook)
    {
        this.price = priceOfBook;
    }
    
    /**
     * @return the title of the book
     */
    public String getTitle()
    {
        return this.title;
    }
    
    /**
     * @return the price of the book
     */
    public double getPrice()
    {
        return this.price;
    }
}
