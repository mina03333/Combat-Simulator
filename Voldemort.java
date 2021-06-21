public class Voldemort extends BadGuy{
  protected Voldemort(String name){
    super(name);
    this.health = 400;
    this.attackDamage = 70;
    this.name = name;

  }

  public int AvadaKedavra(){
    return this.getAttackDmg() * 3;
  }

  public String toString(){
    return "Harry Potter's worst enemy " + this.name + " id: " + super.toString();
  }

}
