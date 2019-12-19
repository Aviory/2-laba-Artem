public enum TypeAnimal {

    Bird("bird"),
    Fish("fish"),
    Dog("Dog");

    private String animal;


    public int action(int x, int y){
        return x + y;
    }


    TypeAnimal(String animal) {
        this.animal = animal;
    }


    public String getAnimal() {
        return animal;
    }
}
