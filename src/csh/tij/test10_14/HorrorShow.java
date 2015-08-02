package csh.tij.test10_14;

interface Monster {
	  void menace();
	}

interface DangerousMonster extends Monster {
	  void destroy();
	}

interface Lethal {
	  void kill();
	}

interface Vampire extends DangerousMonster, Lethal {
	  void drinkBlood();
	}

class VeryBadVampire implements Vampire {
	  public void menace() {}
	  public void destroy() {}
	  public void kill() {}
	  public void drinkBlood() {}
	}	

public class HorrorShow {
	  static void u(Monster b) { b.menace(); }
	  static void v(DangerousMonster d) {
	    d.menace();
	    d.destroy();
	  }
	  static void w(Lethal l) { l.kill(); }
	  public static void main(String[] args) {
	    DangerousMonster barney = new DangerousMonster() {
			@Override
			public void menace() {
				System.out.println("Menace()");
			}
			@Override
			public void destroy() {
				System.out.println("destroy()");
			}
		};
		Vampire vlad=new Vampire() {
			
			@Override
			public void kill() {
				System.out.println("kill()");
			}
			
			@Override
			public void menace() {
				System.out.println("menace()");
			}
			
			@Override
			public void destroy() {
				System.out.println("destroy()");
			}
			
			@Override
			public void drinkBlood() {
				System.out.println("drinkBlood");
			}
		};
	    u(barney);
	    v(barney);
	    u(vlad);
	    v(vlad);
	    w(vlad);
	  }
	} ///:~