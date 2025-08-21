import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Activiteit {
    private final String betraptNaam;
    private final String betraptCategorie;
    private final String betraptOmschrijving;
    private final Set<Personeelslid> betraptPersoneel = new HashSet<>();

    public Activiteit(String betraptNaam, String betraptCategorie, String betraptOmschrijving) {
        if (betraptNaam == null || betraptNaam.isBlank()) throw new IllegalArgumentException("Naam is verplicht");
        if (betraptCategorie == null || betraptCategorie.isBlank()) throw new IllegalArgumentException("Categorie is verplicht");
        if (betraptOmschrijving == null || betraptOmschrijving.isBlank()) throw new IllegalArgumentException("Omschrijving is verplicht");
        this.betraptNaam = betraptNaam;
        this.betraptCategorie = betraptCategorie;
        this.betraptOmschrijving = betraptOmschrijving;
    }

    public String getBetraptNaam() { return betraptNaam; }
    public String getBetraptCategorie() { return betraptCategorie; }
    public String getBetraptOmschrijving() { return betraptOmschrijving; }

    public void betraptVoegPersoneelToe(Personeelslid betraptLid) {
        if (betraptLid == null) throw new IllegalArgumentException("Personeelslid is verplicht");
        betraptPersoneel.add(betraptLid);
    }

    public Set<Personeelslid> getBetraptPersoneel() {
        return Collections.unmodifiableSet(betraptPersoneel);
    }

    @Override
    public boolean equals(Object betraptObj) {
        if (this == betraptObj) return true;
        if (betraptObj == null || getClass() != betraptObj.getClass()) return false;
        Activiteit activiteit = (Activiteit) betraptObj;
        return betraptNaam.equalsIgnoreCase(activiteit.betraptNaam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(betraptNaam.toLowerCase());
    }
}


