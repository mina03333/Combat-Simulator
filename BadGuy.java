public class BadGuy{

  protected int health;
  protected int attackDamage;
  protected int id;
  protected String name;
  private static int nextID = 1;

  public BadGuy(String name){
    this.name = name;
    this.id = BadGuy.nextID++;
  }

  public int getAttackDmg(){
    return this.attackDamage;
  }

  public String getName(){
    return this.name;
  }

  public int getHealth(){
    return this.health;
  }

  public int attack(){
		boolean criticalStrike = Math.random() < .15;
		if (criticalStrike){
			return 2 * this.attackDamage;
		}
		return this.attackDamage;
	}

  public String defend(int damage){
		double damageReducer = Math.random();
		int damageTaken = (int) (damageReducer * (damage + 1));
		this.health -= damageTaken;

    String death = "";
		if (this.health <= 0){
			death = "\n\nI am invincible and you will never be able to kill me- aaaaa " + this.name + " screamed in pain as it dies";
		}

		String toReturn = this.name + " took " + damageTaken + " damage and now has " + this.health + " health." + death;

		return toReturn;
	}

  public void addHealth(int heal){
    this.health += heal;
  }

  public String toString(){
		return this.id + " with " + this.health + " health and " + this.attackDamage + " attackDamage.";
	}

}
