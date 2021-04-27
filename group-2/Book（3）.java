package Book;

public class BookInfo {
    private int id;
    private String bookName;
    private double price;
    private String nick;

    public BookInfo(int id, String bookName, double price, String nick) {
        this.id = id;
        this.bookName = bookName;
        this.price = price;
        this.nick = nick;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "id：" + this.id + "\t书名：" + this.bookName + "\t价格：" + this.price + "元\t出版社：" + this.nick;
    }

}
