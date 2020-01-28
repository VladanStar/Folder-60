package veterinarskaambulanta;

public abstract class Ljiubimac {

    private String ime;
    private int starost;
    private String id;

    public Ljiubimac() {
    }

    public Ljiubimac(String ime, int starost) {
        this.ime = ime;
        this.starost = starost;
    }

    public Ljiubimac(String ime, int starost, String id) {
        this.ime = ime;
        this.starost = starost;
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ljiubimac{" + "ime=" + ime + ", starost=" + starost + ", id=" + id + '}';
    }
    public abstract String generisiIdentifikaciju();

}
