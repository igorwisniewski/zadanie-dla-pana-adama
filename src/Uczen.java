import java.util.Objects;

public class Uczen {
    public String imie, nazwisko;
    public Integer id;
    private Integer i;

    public Uczen(String imie, String nazwisko ) {
        this.imie = imie;
        this.nazwisko = nazwisko;


    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uczen uczen = (Uczen) o;
        return Objects.equals(id, uczen.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, id);
    }
}
