package excercise;

public class Persona {

    private String name;
    private String document;
    private String country;
    
    // Sin parametros
    public Persona() {
        
    }
    
    // parametrizado
    public Persona(String name, String document, String country) {
        this.name = name;
        this.document = document;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
