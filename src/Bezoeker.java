import java.time.LocalDate;

public class Bezoeker extends Persoon {
    private final Leeftijdscategorie betraptCategorie;

    public Bezoeker(String betraptNaam, LocalDate betraptGeboortedatum, String betraptAdres) {
        super(betraptNaam, betraptGeboortedatum, betraptAdres);
        this.betraptCategorie = Leeftijdscategorie.bepaalOpGeboortedatum(betraptGeboortedatum);
    }

    public Leeftijdscategorie getBetraptCategorie() {
        return betraptCategorie;
    }
}


