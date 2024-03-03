public class Main {
    public static void main(String[] args) {
      Fighter f1=new Fighter("messi",10,120,100,70);
      Fighter f2=new Fighter("ronaldo",20,85,85,10);

      Match match=new Match(f1,f2,85,100);
      match.run();

    }
}
