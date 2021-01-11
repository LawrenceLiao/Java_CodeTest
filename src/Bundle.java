public class Bundle {

    private String format;
    private String code;
    private int numOfPosts;
    private double price;
    private int numOfBundles;

    public Bundle() {
    }

    public Bundle(String format, String code, int numOfPosts, double price, int numOfBundles) {
        this.format = format;
        this.code = code;
        this.numOfPosts = numOfPosts;
        this.price = price;
        this.numOfBundles = numOfBundles;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNumOfPosts() {
        return numOfPosts;
    }

    public void setNumOfPosts(int numOfPosts) {
        this.numOfPosts = numOfPosts;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumOfBundles() {
        return numOfBundles;
    }

    public void setNumOfBundles(int numOfBundles) {
        this.numOfBundles = numOfBundles;
    }
}
