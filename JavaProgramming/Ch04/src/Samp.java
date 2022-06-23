public class Samp {
    int id;
    public Samp(int x){
        this.id = x;
    }

    public Samp() {
        this(0);
        System.out.println("생성자 호출");
    }
}
