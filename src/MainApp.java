public class MainApp {
    public static void main(String[] args){
        MyConsole console = new MyConsole();
        VetClinic vetClinic = new VetClinic(console);
        vetClinic.AddNewAnimal(TypeAnimal.Bird,"Sharik",console.inputString("enter name"),"","","0",0,1,"1");

    }
}
