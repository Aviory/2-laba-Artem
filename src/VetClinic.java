
import java.util.ArrayList;

public class VetClinic implements Price{


    private final MyConsole console;
    private ArrayList<Animal> animals = new ArrayList<>();

    public VetClinic(MyConsole console) {
        this.console = console;
    }


    public void AddNewAnimal(TypeAnimal type,String nickname,String name,String inn,String hostName,String diagnosis,int weight,int period,String date ) {

        Animal animal;
        if (TypeAnimal.Bird == type){
            animal = new Bird(TypeAnimal.Bird,nickname,name,inn,hostName,diagnosis,weight,period,date,console.inputString("featherCondition"),console.inputString("beakCondition"));
        }else if (TypeAnimal.Fish == type){
            animal = new Fish(TypeAnimal.Fish,nickname,name,inn,hostName,diagnosis,weight,period,date,console.inputString("finsCondition"),console.inputString("conditionOfScales"));
        }else{
            animal = new Dog(TypeAnimal.Dog,nickname,name,inn,hostName,diagnosis,weight,period,date,console.inputString("conditionsPaws"),console.inputString("conditionTail"));
        }
        animals.add(animal);
    }

    public void SearchAnimalForFioOwner(String inn){
        for (Animal animal :animals) {
            if (animal.inn.equals(inn)){
                console.output(animal.toString());
            }
        }

    }

    @Override
    public void Check(String inn) {
        int price = 1;
        for (Animal animal: animals) {
            if (animal.inn.equals(inn)){
                if(animal.getType().equals(TypeAnimal.Bird)){
                    price = animal.getWeight()*3;
                    System.out.println(price);
                }
                if(animal.getType().equals(TypeAnimal.Fish)){
                    price = animal.getWeight()*6;
                    System.out.println(price);
                }
                if(animal.getType().equals(TypeAnimal.Dog)){
                    price = animal.getWeight()*12;
                    System.out.println(price);

                }
            }

        }
    }
}
