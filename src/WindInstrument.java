class WindInstrument extends Instrumento {
    private String name;

    public WindInstrument(String name) {
        this.name = name;
    }

    public void play(char note) {
        System.out.println(name + " is playing note " + note + ".");
    }

    @Override
    public void play() {
        System.out.println(name + " is playing a wind sound.");
    }

    @Override
    public String toString() {
        return "Wind Instrument: " + name;
    }
}
