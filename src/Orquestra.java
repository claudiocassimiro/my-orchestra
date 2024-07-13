import java.util.ArrayList;
import java.util.List;

class Orquestra {
    private List<Instrumento> instrumentos;

    public Orquestra() {
        instrumentos = new ArrayList<>();
    }

    public void addInstrumento(Instrumento instrumento) {
        instrumentos.add(instrumento);
    }

    public void playAll() {
        for (Instrumento instrumento : instrumentos) {
            instrumento.play();
        }
    }

    public void playInstrumento(int index) {
        if (index >= 0 && index < instrumentos.size()) {
            instrumentos.get(index).play();
        } else {
            System.out.println("Instrumento não encontrado.");
        }
    }
}
