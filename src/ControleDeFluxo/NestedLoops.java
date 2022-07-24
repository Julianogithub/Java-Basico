package ControleDeFluxo;

public class NestedLoops {
	public String run() {
		for(int i=1; i<=5; i++){
			for(int j=1; j<=3; j++){
				System.out.println("Value of i:"+i+" and value of j:"+j);
			}
			System.out.println("\n************************\n");
		}
		
		/*
		 *  @
		 *  @@
		 *  @@@
		 *  @@@@
		 *  @@@@@
		 */
		return"--------- Nested Loops ------------";
	}
}
