package Q1;

public class Happy extends Moody{
    String happy_words = "happy";
    String express_feelings = "heeehee....hahahah...HAHAHA!!";

    @Override
    public String getMood() {
        return happy_words;
    }

    @Override
    public void queryMood() {
        System.out.println("I feel " + this.getMood() + " today!!");
    }

    @Override
    public void expressFeelings() {
        System.out.println(express_feelings);
    }
}
