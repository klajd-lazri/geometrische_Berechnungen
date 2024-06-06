public class Klajdi_Klasse {

    private int breite_rechteck;
    private int laenge_rechteck;

    public void flaecheninhalt_rechteck(int breite_rechteck, int laenge_rechteck) {
        int flaeche = breite_rechteck * laenge_rechteck;

        System.out.println("Die Flaeche des Rechtecks ist: "+flaeche);

    }


    private int hoehe_dreieck;
    private int basis_dreieck;

    public void flaecheninhalt_dreieck(int hoehe_dreieck, int basis_dreieck) {
        double flaeche = (double) (hoehe_dreieck * basis_dreieck) / 2;

        System.out.println("Die Flaeche des Dreiecks ist: "+flaeche);

    }


    private int laenge_quadrat;

    public void umfang_quadrat(int laenge_quadrat) {
        int umfang = laenge_quadrat * 4;

        System.out.println("Der Umfang des Rechtecks ist: "+umfang);

    }

}
