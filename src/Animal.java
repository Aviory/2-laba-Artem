public class Animal {
    private TypeAnimal type;
    String nickname;
    String name;
    String inn;
    String hostName;
    String diagnosis;
    int weight;
    int period;
    String date;

    public TypeAnimal getType() {
        return type;
    }

    public void setType(TypeAnimal type) {
        this.type = type;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nickname='" + nickname + '\'' +
                ", name='" + name + '\'' +
                ", inn='" + inn + '\'' +
                ", hostName='" + hostName + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", weight=" + weight +
                ", period=" + period +
                ", date='" + date + '\'' +
                '}';
    }

    public Animal(TypeAnimal type,String nickname, String name, String inn, String hostName, String diagnosis, int weight, int period, String date) {
        this.type = type;
        this.inn = inn;
        this.nickname = nickname;
        this.name = name;
        this.hostName = hostName;
        this.diagnosis = diagnosis;
        this.weight = weight;
        this.period = period;
        this.date = date;
    }
}
