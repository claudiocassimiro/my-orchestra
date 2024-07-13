public class Main {
    public static void main(String[] args) {
        Orquestra orquestra = new Orquestra();

        Instrumento violao = new StringInstrument("Violão");
        Instrumento tambor = new PercussionInstrument("Tambor");
        WindInstrument flauta = new WindInstrument("Flauta");

        orquestra.addInstrumento(violao);
        orquestra.addInstrumento(tambor);
        orquestra.addInstrumento(flauta);

        System.out.println("Tocando todos os instrumentos:");
        orquestra.playAll();

        System.out.println("\nTocando instrumento específico (flauta):");
        flauta.play('C');
    }
}
