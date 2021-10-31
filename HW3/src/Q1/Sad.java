package Q1;

public class Sad extends Moody{
    String sad = "sad";
    String express_feelings = "waah boo hoo weep sob";
    @Override

    public String getMood() {
        return sad;
    }

    @Override
    public void queryMood() {
        System.out.println("I feel " + this.getMood() + " today!!");
    }

    @Override
    public void expressFeelings() {
        System.out.println(express_feelings);;
    }
}
