package Entities;

import java.util.ArrayList;
import java.util.List;

public class SignalDB {
	
	// SignalPooldaki sinyaller burada toplanýr
	ArrayList<Signal> signalPoolList = new ArrayList<Signal>();

	
	
	// SignalDB nesnesi oluþturulunca Databasedeki sinyaller gösterilir
	public SignalDB(){
		loadSignal();
		//Doðan: load data bunun içinde çaðrýlacak
	}
	
	// dataBase'eklenen sinyalleri gösterir.
	public void loadSignal() { 
		Signal signal1 = new Signal(01, 01, 10, 0.1, 1);
		Signal signal2 = new Signal(02, 02, 20, 0.2, 2);
		Signal signal3 = new Signal(03, 03, 30, 0.3, 3);
		Signal signal4 = new Signal(04, 04, 40, 0.4, 4);
		Signal signal5 = new Signal(05, 05, 50, 0.5, 5);
		Signal signal6 = new Signal(06, 06, 60, 0.6, 6);
		Signal signal7 = new Signal(07, 07, 70, 0.7, 7);
		this.signalPoolList.add(signal1);
		this.signalPoolList.add(signal2);
		this.signalPoolList.add(signal3);
		this.signalPoolList.add(signal4);
		this.signalPoolList.add(signal5);
		this.signalPoolList.add(signal6);
		this.signalPoolList.add(signal7);
	// to represent dataBase Signal	
	/*
	 * int i=1; System.out.println("The signals available in DataBase"); for (Signal
	 * signal : signalPoolList ) { System.out.println(); System.out.println(i +
	 * ". dataBase signal"); System.out.println("CanId : " + signal.getCanId());
	 * System.out.println("SignalId : " + signal.getSignalId());
	 * System.out.println("SignalLenght : " + signal.getSignalLenght());
	 * System.out.println("Factor : " + signal.getFactor());
	 * System.out.println("Offset : " + signal.getOffset()); i++;
	 * System.out.println(); }
	 */
	}
	
	public void showDataBase() {
		
		  int i=1; System.out.println("The signals available in DataBase"); for (Signal
		  signal : signalPoolList ) { System.out.println(); System.out.println(i +
		  ". dataBase signal"); System.out.println("CanId : " + signal.getCanId());
		  System.out.println("SignalId : " + signal.getSignalId());
		  System.out.println("SignalLenght : " + signal.getSignalLenght());
		  System.out.println("Factor : " + signal.getFactor());
		  System.out.println("Offset : " + signal.getOffset()); i++;
		  System.out.println(); }
		
	}

}
