class Main {
  public static void main(String[] args) {
    /*
      *
      **
      ***
      ****
      *****
      */
    int i=0;// czyli mam sobie zmienna i równą 0
    while(i<5){ // jeżeli ta zmienna będzie mniejsza od 5 to będzie się wykonywać instrukcja poniżej
      i++; // 0+1=1 i tak cały czas aż do pięciu
      for(int y=0;y<i;y++)// nowa zmienna, ta zmienna jest mniejsza niż jeden w pierwszym przypadu to warunek trwania pętli jeśli może byc dalej wykonywana to y=0+1
        System.out.print("*");// do wczytnia znaku nie daje sie +,a i dodatkowo jakbym dodał do println to miałbym te gwiazdki ale układające się pionowo a nie poziomo
        System.out.println();// robi mi przerwe pomiędzy kolejną seria pętli 

      }
    }
    
  }
