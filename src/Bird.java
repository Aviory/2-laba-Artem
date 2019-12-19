public class Bird extends Animal{
    String featherCondition;
    String beakCondition;

    public Bird(TypeAnimal type,String nickname, String name, String hostName, String diagnosis, String inn, int weight, int period, String date, String featherCondition, String beakCondition) {
        super(type,nickname, name,inn, hostName, diagnosis, weight, period, date);
        this.featherCondition = featherCondition;
        this.beakCondition = beakCondition;
    }

}
