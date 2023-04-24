/**

 <klasa uczen zawiera:

 o dwa stałe pola znakowe imie i nazwisko,

 o pole całkowitoliczbowe id, które generowane jest automatycznie przy użyciu mechanizmu autoinkrementacji (wykorzystaj pomocniczo zmienną statyczną)

 o konstruktor parametryczny oraz konstruktor kopiujący (tworzący obiekt na podstawie innego obiektu klasy uczeń, kopiowaniu podlegają tylko i wyłącznie pola imie oraz nazwisko)

 o w konstruktorach pole id uzupełniane jest automatycznie

 o metody get dla pól imię i nazwisko

 o prawidłowo zaimplementowane metody equals oraz hashCode, przyjmij założenie, że da obiekty są sobie równe tylko wtedy, kiedy ich id jest równe

 o metodę toString>

 <imie> : <String>, <pole na imie>
 <nazwisko> : <String>, <pole na Nazwisko>
 <id> : <Integer>, <pole na id>

 @author: <Igor> <Wisniewski>

 **/


import java.util.Objects;

public class Uczen {
    public String imie, nazwisko;
    public Integer id;


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
