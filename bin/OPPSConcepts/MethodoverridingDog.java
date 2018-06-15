package OPPSConcepts;

public class MethodoverridingDog  extends MethodoverridingAnimal{
    @Override
    public void sound(){
        System.out.println("Woof");
    }
    public static void main(String args[]){
    	MethodoverridingAnimal obj = new MethodoverridingDog();
    	obj.sound();

}
}
