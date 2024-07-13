class StringInstrument extends Instrumento {
    private String name;

    public StringInstrument(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " is playing a string sound.");
    }

    @Override
    public String toString() {
        return "String Instrument: " + name;
    }
}
