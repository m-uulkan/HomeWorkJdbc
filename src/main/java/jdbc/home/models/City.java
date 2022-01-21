package jdbc.home.models;

public class City  {
 private int id;
 private String name;
 private int quantityOfPeople;
 private Long zipCode;
 private String language;

    public City(int id, String name, int quantityOfPeople, Long zipCode, String language) {
        this.id = id;
        this.name = name;
        this.quantityOfPeople = quantityOfPeople;
        this.zipCode = zipCode;
        this.language = language;
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

    public int getQuantityOfPeople() {
        return quantityOfPeople;
    }

    public void setQuantityOfPeople(int quantityOfPeople) {
        this.quantityOfPeople = quantityOfPeople;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(Long zipCode) {
        this.zipCode = zipCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantityOfPeople=" + quantityOfPeople +
                ", zipCode=" + zipCode +
                ", language='" + language + '\'' +
                '}';
    }
}


