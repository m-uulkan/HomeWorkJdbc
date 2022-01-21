package jdbc.home.models;

public class Country {
    private int id;
    private String name;
    private String capital;
    private String currency_code;
    private String president;

    public Country() {
    }

    public Country(int id, String name, String capital, String currency_code, String president) {
        this.id = id;
        this.name = name;
        this.capital = capital;
        this.currency_code = currency_code;
        this.president = president;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }
}
