package OPPSConcepts;

public class MethodoverridingCat extends MethodoverridingAnimal{
    @Override
    public void sound(){
        System.out.println("Cat making sound Meow");
    }
    public static void main(String args[]){
    	MethodoverridingAnimal obj = new MethodoverridingCat();
    	obj.sound();

}
}
