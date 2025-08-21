import java.time.LocalDate;

public abstract class Persoon {
    private final String betraptNaam;
    private final LocalDate betraptGeboortedatum;
    private final String betraptAdres;

    protected Persoon(String betraptNaam, LocalDate betraptGeboortedatum, String betraptAdres) {
        if (betraptNaam == null || betraptNaam.isBlank()) {
            throw new IllegalArgumentException("Naam mag niet leeg zijn");
        }
        if (betraptGeboortedatum == null) {
            throw new IllegalArgumentException("Geboortedatum mag niet null zijn");
        }
        if (betraptAdres == null || betraptAdres.isBlank()) {
            throw new IllegalArgumentException("Adres mag niet leeg zijn");
        }
        this.betraptNaam = betraptNaam;
        this.betraptGeboortedatum = betraptGeboortedatum;
        this.betraptAdres = betraptAdres;
    }

    public String getBetraptNaam() {
        return betraptNaam;
    }

    public LocalDate getBetraptGeboortedatum() {
        return betraptGeboortedatum;
    }

    public String getBetraptAdres() {
        return betraptAdres;
    }
}


