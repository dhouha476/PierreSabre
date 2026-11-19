package histoire;
import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;
import personnages.Ronin;



public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "Kombucha",54);
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("jeu", 2);
		prof.acheter("Kimono", 50);
	//	Commercant marco = new Commercant("Marco", 20);
	//	marco.direBonjour();
	//	marco.seFaireExtorquer();
	//	marco.recevoir(15);
	//	marco.boire();
	//	Commercant marco = new Commercant("Marco", 15);
	//	Yakuza yaku = new Yakuza("Yaku le Noir ", "whisky ",30,"warsong ");
	//	yaku.direBonjour();
	//	yaku.extorquer(marco);
		Commercant marco= new Commercant("Marco", 15);
		Ronin roro= new Ronin("RORO", "shochu", 60);
		roro.direBonjour();
		roro.donner(marco);
		
		

	}

}
