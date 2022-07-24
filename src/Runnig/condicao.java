package Runnig;

import java.util.Scanner;
import javax.swing.*;

import ComesoJava.BigDecimalDemo;
import ComesoJava.DescrevendoVariaves;
import ComesoJava.HelloWorld;
import ComesoJava.PrimitiveDataTypes;
import ComesoJava.String_Float;
import ComesoJava.TypesBoolean;
import ConjuntosOfObj.Demo;
import ConjuntosOfObj.DemoCar;
import ConjuntosOfObj.DemoGraphics;
import ConjuntosOfObj.DemoPerson;
import ConjuntosOfObj.DemoPhone;
import ControleDeFluxo.BreakContinue;
import ControleDeFluxo.DoWhileLoop;
import ControleDeFluxo.Do_SwitchCase_While;
import ControleDeFluxo.ForLoop;
import ControleDeFluxo.ForLoopNumber;
import ControleDeFluxo.LoopsRevisited;
import ControleDeFluxo.NestedLoops;
import ControleDeFluxo.NestedLoopsExercise;
import ControleDeFluxo.PlayJava;
import ControleDeFluxo.SwitchCase1;
import ControleDeFluxo.SwitchCase2;
import ControleDeFluxo.SwitchCase3;
import ControleDeFluxo.WhileLoop;
import ManupularClasses.RunClasses;
import MethodsJava.MethodsExercise;
import MethodsJava.MethodsOverloading;
import MethodsJava.MethodsOverloading2;
import MethodsJava.MethodsParameters;
import MethodsJava.MethodsType;
import Operadores.OpeBasico;
import Operadores.OpeDeAssignment;
import Operadores.OpeDeDecizao;
import Operadores.OpeDeDecizao2;
import Operadores.OpeDeDecizao3;
import Operadores.OpeIfElse;
import Operadores.OpeTernary;
import interfacesStart.DemoInterface;

import java.awt.Color;
import java.math.BigDecimal;

public class condicao {

	public static void main(String[] args) {
		do {
			Scanner saida = new Scanner(System.in);
			System.out.println(" \tDigite o número referente ao codigo JAVA BAZICO desejado:");
			System.out.println(" \tNumero 0 para finalizar:");
			System.out.println(" \tE outros numeros para continuar de 1 ate 9 :");

			Scanner entrada = new Scanner(System.in);
			int numero = entrada.nextInt();

			switch (numero) {
			case 0:
				System.out.println("\tPrograma encerado");
				System.exit(0);
				break;
			case 1:

				HelloWorld helloWorld = new HelloWorld();
				System.out.println(helloWorld.run());

				DescrevendoVariaves descrevendoVareiaves = new DescrevendoVariaves();
				System.out.println(descrevendoVareiaves.run());

				PrimitiveDataTypes primitiveDataTypes = new PrimitiveDataTypes();
				System.out.println(primitiveDataTypes.run());

				BigDecimalDemo bigDec = new BigDecimalDemo();
				System.out.println(bigDec.run());

				break;
			case 2:

				TypesBoolean typesBoolean = new TypesBoolean();
				System.out.println(typesBoolean.run());

				String_Float st_Fl = new String_Float();
				System.out.println(st_Fl.run());

				OpeBasico opeBasica = new OpeBasico();
				System.out.println(opeBasica.run());

				OpeDeDecizao opeDeDecizao = new OpeDeDecizao();
				System.out.println(opeDeDecizao.run());

				OpeDeDecizao2 opeDeDecizao2 = new OpeDeDecizao2();
				System.out.println(opeDeDecizao2.run());

				OpeDeDecizao3 opeDeDecizao3 = new OpeDeDecizao3();
				System.out.println(opeDeDecizao3.run());

				OpeTernary opeTernary = new OpeTernary();
				System.out.println(opeTernary.run());
				break;
			case 3:

				OpeDeAssignment opeDeAssignment = new OpeDeAssignment();
				System.out.println(opeDeAssignment.run());

				OpeIfElse opeIfElse = new OpeIfElse();
				System.out.println(opeIfElse.run());
				
				SwitchCase1 switchCase1 = new SwitchCase1();
				System.out.println(switchCase1.run());

				SwitchCase2 switchCase2 = new SwitchCase2();
				System.out.println(switchCase2.run());

				SwitchCase3 switchCase3 = new SwitchCase3();
				System.out.println(switchCase3.run());

				ForLoop forLoop = new ForLoop();
				System.out.println(forLoop.run());

				ForLoopNumber forLoopNumber = new ForLoopNumber();
				System.out.println(forLoopNumber.run());

				break;
			case 4:

				MethodsType methodsType = new MethodsType();
				System.out.println(methodsType.run());

				MethodsParameters methodsParameters = new MethodsParameters();
				System.out.println(methodsParameters.run());

				MethodsExercise methodsExercise = new MethodsExercise();
				System.out.println(methodsExercise.run());

				MethodsOverloading methodsOverloading = new MethodsOverloading();
				System.out.println(methodsOverloading.run());

				MethodsOverloading2 methodsOverloading2 = new MethodsOverloading2();
				System.out.println(methodsOverloading2.run());

				break;
			case 5:

				RunClasses runClasses = new RunClasses();

				System.out.println(runClasses.runCar1());

				System.out.println(runClasses.runCar2());

				System.out.println(runClasses.runCar3());

				Demo demo = new Demo();
				System.out.println(demo.runnig());

				System.out.println(demo.runnig2());

				System.out.println(demo.runSuper());

				System.out.println(demo.runToString());

				System.out.println(demo.runToString2());

				break;
			case 6:

				DemoGraphics demoGraphics = new DemoGraphics();

				System.out.println(demoGraphics.runGraphics());

				System.out.println(demoGraphics.runGraphics2());

				System.out.println(demoGraphics.runGraphics3());

				DemoPerson demoPerson = new DemoPerson();

				System.out.println(demoPerson.runPerson());

				System.out.println(demoPerson.runPerson2());

				DemoPhone demoPhone = new DemoPhone();

				System.out.println(demoPhone.runPhone());

				System.out.println(demoPhone.runPhone2());

				break;
			case 7:

				DemoInterface demoInterface = new DemoInterface();

				System.out.println(demoInterface.runPhone());

				System.out.println(demoInterface.runNome());

				System.out.println(demoInterface.runNomeAbstract());

				System.out.println(demoInterface.runShop());

				break;
			case 8:
				DemoCar demoCar = new DemoCar();

				System.out.println(demoCar.runnigCar());

				System.out.println(demoCar.runnigCar2());

				System.out.println(demoCar.runSuper());

				System.out.println(demoCar.runToString());

				System.out.println(demoCar.runToString2());
				break;
			case 9:

				WhileLoop whileLoop = new WhileLoop();
				System.out.println(whileLoop.run());

				DoWhileLoop doWhileLoop = new DoWhileLoop();
				System.out.println(doWhileLoop.run());

				LoopsRevisited loopsRevisited = new LoopsRevisited();
				System.out.println(loopsRevisited.run());

				BreakContinue breakContinue = new BreakContinue();
				System.out.println(breakContinue.run());

				NestedLoops nestedLoops = new NestedLoops();
				System.out.println(nestedLoops.run());

				NestedLoopsExercise nestedLoopsExercise = new NestedLoopsExercise();
				System.out.println(nestedLoopsExercise.run());

				PlayJava playJava = new PlayJava();
				System.out.println(playJava.run());

				Do_SwitchCase_While do_SwitchCase_While = new Do_SwitchCase_While();
				System.out.println(do_SwitchCase_While.run());

				break;

			default:
				System.out.println("\tNumero não corespode, digite de 1 a 9");
				break;
			}
		} while (1 != 0);

	}
}