class PercussionInstrument extends Instrumento {
    private String name;

    public PercussionInstrument(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " is playing a percussion sound.");
    }

    @Override
    public String toString() {
        return "Percussion Instrument: " + name;
    }
}
