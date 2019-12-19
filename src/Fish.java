public class Fish extends Animal {
    String finsCondition;
    String conditionOfScales;

    public Fish(TypeAnimal type,String nickname, String name, String hostName, String diagnosis, String inn, int weight, int period, String date, String finsCondition, String conditionOfScales) {
        super(type,nickname, name, inn, hostName, diagnosis, weight, period, date);
        this.finsCondition = finsCondition;
        this.conditionOfScales = conditionOfScales;
    }
}
