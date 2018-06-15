package OPPSConcepts;

public class MethodoverridingLion  extends MethodoverridingAnimal{
    @Override
    public void sound(){
        System.out.println("Lion Roars");
    }
    public static void main(String args[]){
    	MethodoverridingAnimal obj = new MethodoverridingLion();
    	obj.sound();

}
}
