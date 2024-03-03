public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
      this.f1=f1;
      this.f2=f2;
      this.minWeight=minWeight;
      this.maxWeight=maxWeight;

    }
    void run(){
        if(isCheck()){
            // Başlangıçta rastgele seçilen dövüşçüden başla
            Fighter currentFighter = (Math.random() < 0.5) ? f1 : f2;
            Fighter opponent = (currentFighter == f1) ? f2 : f1;
            System.out.println("oyuna ilk " +currentFighter.name+" başlıyor");

            while (this.f1.health>0 && this.f2.health>0){
                System.out.println("====Round====");
                // Vuruşları gerçekleştir
                opponent.health = currentFighter.hit(opponent);
            if(isWin()){
                break;
            }

                // Dövüşçü değiştir
                Fighter temp = currentFighter;
                currentFighter = opponent;
                opponent = temp;
                opponent.health = currentFighter.hit(opponent);
                if(isWin()){
                    break;
                }

               ;
                System.out.println(this.f1.name+" Saglik : "+this.f1.health);
                System.out.println(this.f2.name+" Saglik : "+this.f2.health);
            }

        }else{
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }
    boolean isCheck(){
      return  (this.f1.weight>=minWeight && this.f1.weight<=maxWeight) &&(this.f2.weight>=minWeight && this.f2.weight<=maxWeight);
    }

    boolean isWin(){
        if(this.f1.health==0){
            System.out.println(this.f2.name+" Kazandı!");
            return true;
        }
        if(this.f2.health==0){
            System.out.println(this.f1.name+" Kazandı!");
            return true;
        }
        return false;
    }
}
