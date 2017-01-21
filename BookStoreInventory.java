import java.util.ArrayList;
/**
 * Model a bookstore's inventory of books.
 * 
 * @author Ian Duron
 */
public class BookStoreInventory
{
    private ArrayList<Book> inventory;

    /**
     * Constructor for the BookStoreInventory class
     */
    public BookStoreInventory()
    {
        this.inventory = new ArrayList<Book>();
    }

    /**
     * adds the specified book to the BookStoreInventory
     * @param book the book you want to add
     */
    public void add(Book book)
    {
        inventory.add(book);
    }

    /**
     * removes the first book in the list with the specified title.
     * @param book the book you want to remove
     */
    public void remove(String book)
    {
        for(int i = 0; i < inventory.size(); i++)
        {
            if(inventory.get(i).getTitle() == book)
            {
                inventory.remove(i);
                return;
            }
        }
    }

    /**
     *@return determines if a book with a given title is in the BookStoreInventory
     *@param bookCheck the book you're trying to find
     */
    public boolean contains(String bookCheck)
    {
        for(Book p : inventory)
        {
            if(p.getTitle() == bookCheck)
            {
                return true;
            }
        }
        return false;
    }

    /**
     * @return the ArrayList of the Book titles in the BookStoreInventory.
     */
    public ArrayList<String> list()
    {
        ArrayList<String> list = new ArrayList<String>();
        for(Book p : inventory)
        {
            list.add(p.getTitle());
        }
        return list;
    }
}

