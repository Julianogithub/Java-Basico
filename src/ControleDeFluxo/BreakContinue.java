package ControleDeFluxo;

public class BreakContinue {
	public String run() {
		for(int i=1; i<=10; i++){
       	 if(i == 5){
       		 continue;
       	 }
       	 System.out.println(i);
        }
		return"--------- Break and Continue ------------";
	}
}
