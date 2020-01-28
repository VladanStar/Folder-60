package veterinarskaambulanta;

import java.util.LinkedList;

public class Red {

    private LinkedList<Ljiubimac> red;

    public Red() {
    }

    public Red(LinkedList<Ljiubimac> red) {
        this.red = red;
    }
    public void dodajURed(Ljiubimac ljiubimac){
    red.add(ljiubimac);
    }
    public Ljiubimac prozoviSledeceg() {
		return red.poll();
	}
    @Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		int i = 1;
		for(Ljiubimac ljiubimac : red) 			
			sb.append(i++ + ": " + ljiubimac + "\n");
		
		return sb.toString();
	}
        

}
