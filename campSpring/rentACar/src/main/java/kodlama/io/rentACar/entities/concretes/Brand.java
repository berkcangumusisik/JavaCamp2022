package kodlama.io.rentACar.entities.concretes;

public class Brand {
    private int id;
    private String name;

    public Brand() {
        super();
    }

    public Brand(int id, String name) {
        super();
        this.id = id;
        this.name = name;
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
}

// Entites klasörü altında concretes klasörü oluşturuldu.
// Entities bizim nesnelerimizdir. Bu nesnelerin özelliklerini tutar.