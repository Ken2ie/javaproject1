public class Logic {

    public Logic(){
    }

    public void init(int generatedNumber ){
        testPrint(generatedNumber, " Was generated.");
    }

    public void testPrint(int rand,String test){
        System.out.println(rand + " " + test);
    }
}
