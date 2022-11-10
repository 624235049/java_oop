
package chap4;



public class Saleman {
    private String id;
    private String name;
    private String surname;
    private int saleClass;
    private double saleTotal;

    public Saleman(String id, String name, String surname, int saleClass, double saleTotal) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.saleClass = saleClass;
        this.saleTotal = saleTotal;
    }

    
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSaleClass() {
        return saleClass;
    }

    public void setSaleClass(int saleClass) {
        this.saleClass = saleClass;
    }

    public double getSaleTotal() {
        return saleTotal;
    }

    public void setSaleTotal(double saleTotal) {
        this.saleTotal = saleTotal;
    }
    
    
    
}
