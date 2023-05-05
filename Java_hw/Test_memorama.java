package tareas;

public class Test_memorama {

	public static void main(String[] args) {
		
        Memorama<String> memorama = new Memorama<>();
        memorama.agregaPar("Mi villano favorito");
        memorama.agregaPar("La noche eterna");
        memorama.agregaPar("Forever Young");
        memorama.revolver();
        System.out.println(memorama.Carta1(5));
        System.out.println(memorama.Carta2(1));

	}

}
