import java.util.ArrayList;
import java.util.List;

public class Rifugio {
	public static void main(String[] args) {
		List<Animale> elenco= new ArrayList<Animale>();
		List<Volante> gabbia= new ArrayList<Volante>();
		List<Natante> acquario= new ArrayList<Natante>();
		Animale anim=new Farfalla("Papilio-thoas");
		elenco.add(anim); 
		gabbia.add((Volante)anim);
		anim=new Uccello("Piccione");
		gabbia.add((Volante)anim);
		elenco.add(anim);
		anim=new PesceDiMare("Delfino");
		acquario.add((Natante)anim);
		elenco.add(anim);
		for (Animale a: elenco) {
			System.out.println(a);
		}
		System.out.println("Nella gabbia:");
		for (Volante v: gabbia) {
			System.out.println(v);
		}
		System.out.println("Nell'acquario:");
		for (Natante n: acquario) {
			System.out.println(n);
		}
	}
}
