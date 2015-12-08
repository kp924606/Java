public class RPG {
	public static void drawFight(Role role){
		System.out.print(role.getName());
		role.fight();
	}	
	public static void showBlood(Role role){
		System.out.printf("%2s ����:%2d  ��q: %2d%n",role.getName(),role.getLevel(),role.getBlood());
	}	
	public static void main(String[] args) {	
		SwordsMan swordsMan=new SwordsMan();
		swordsMan.setName("Hero");
		swordsMan.setLevel(1);
		swordsMan.setBlood(200);
		
		Magician magician=new Magician();
		magician.setName("Protoss");
		magician.setLevel(1);
		magician.setBlood(100);
		//System.out.printf("�C��:(%s, %d, %d)%n",swordsMan.getName(),swordsMan.getLevel(),swordsMan.getBlood());			
		//System.out.printf("�]�k�v:(%s, %d, %d)%n",magician.getName(),magician.getLevel(),magician.getBlood());			
		//showBlood(swordsMan);
		//showBlood(magician);
		//drawFight(swordsMan);
		//drawFight(magician);
		System.out.println(swordsMan.toString());
		System.out.println(magician.toString());
		
	}
}
