package Q1;

public class Psychiatrist {
    public Moody mood;
    String Quesions = "How are you feeling today?";

    public Psychiatrist(Moody mood){
        this.mood = mood;
    }
    public void examine(){
        System.out.println(Quesions);
        mood.queryMood();

    }
    public void observe(){
        mood.expressFeelings();
    }

    @Override
    public String toString() {
        return mood.toString();
    }

    public static void main(String[] args) {
        Psychiatrist observedPerson1 = new Psychiatrist(new Happy());
        Psychiatrist observedPerson2 = new Psychiatrist(new Sad());
        observedPerson1.examine();
        System.out.println(" ");
        observedPerson1.observe();
        System.out.println(" ");
        observedPerson2.examine();
        System.out.println(" ");
        observedPerson2.observe();
    }
}

