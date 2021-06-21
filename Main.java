class Main {
  public static void main(String[] args) {

    Thanos Thanos = new Thanos("Thanos");
    Voldemort Voldemort = new Voldemort("Voldemort");
    System.out.println(Thanos.toString());
    System.out.println(Voldemort.toString());

    System.out.println("\n FIGHT!!!\n");
    
    int cnt = 0;

    while(Voldemort.getHealth() > 0 && Thanos.getHealth() > 0){

      if (cnt%3 == 0){
        System.out.println(Thanos.getName() + " snaps!!!");
        Thanos.snap();
        System.out.println(Thanos.getName() + " has healed for 50 HP and now has " + Thanos.getHealth() + " health.\n");
        if (Voldemort.getHealth() > 0){
          System.out.println(Voldemort.getName() + " uses his spell, AvadaKedavra!\n\n" + Thanos.defend(Voldemort.AvadaKedavra()) + "\n");
        }
      } else {
        System.out.println(Voldemort.defend(Thanos.attack()) + "\n");
        if (Voldemort.getHealth() > 0){
          System.out.println(Thanos.defend(Voldemort.attack()) + "\n");
        }
      }
      cnt++;
    }

  }
}
