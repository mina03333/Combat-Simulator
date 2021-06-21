public class Thanos extends BadGuy{
   public Thanos(String name){
    super(name);
    this.health = 500;
    this.attackDamage = 100;
  }

  public void snap(){
    this.addHealth(50);
  }

  public String toString(){
    return "Avengers' worst enemy " + this.name + " id: " + super.toString();
  }
}
