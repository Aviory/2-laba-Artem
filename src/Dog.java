public class Dog extends Animal {
    String conditionsPaws;
    String conditionTail;

    public Dog(TypeAnimal type,String nickname, String name, String hostName, String diagnosis, String inn, int weight, int period, String date, String conditionsPaws, String conditionTail) {
        super(type, nickname, name, inn, hostName, diagnosis, weight, period, date);
        this.conditionsPaws = conditionsPaws;
        this.conditionTail = conditionTail;
    }
}

