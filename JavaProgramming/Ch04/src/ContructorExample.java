public class ContructorExample {
    int x;
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {return x;}
    public ContructorExample(int x){
        this.x =x;
    }
    public ContructorExample(){
    }

    public static void main(String[] args) {
        ContructorExample a = new ContructorExample(10);
        int n = a.getX();
        System.out.println(n);
    }
}
