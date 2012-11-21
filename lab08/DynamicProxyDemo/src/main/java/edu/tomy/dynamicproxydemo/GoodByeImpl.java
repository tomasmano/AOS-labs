package edu.tomy.dynamicproxydemo;


public class GoodByeImpl implements GoodBye {

    public String sayGoodbye(String name) {
        System.out.println("say goodbye called...");
        return String.format("Goodbye %s", name);
    }
    
    public String sayHello(String name){
        System.out.println("say hello called...");
       return String.format("Hello %s", name);
    }
    
    public String sayRespect(){
        System.out.println("say respect called...");
        return "respect";
    }
    
}
