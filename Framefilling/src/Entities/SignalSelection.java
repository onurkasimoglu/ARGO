package Entities;

import java.util.ArrayList;

public class SignalSelection extends SignalDB {
	// güncel müþteri istekleri bu listede toplanýr
	private static ArrayList<Signal> selecetedSignalList = new ArrayList<Signal>();

	// parametresiz constructor
	public SignalSelection() {
	}

	// Müþteri sinyal ekler
	public void addSignal(int selection) {

		selecetedSignalList.add(signalPoolList.get(selection));
		showSelectedSignals();

	}

	// Müþteri sinyal siler
	public void deleteSignal(int selection) {

		selecetedSignalList.remove(selection);
		showSelectedSignals();

	}

	// Seçilen sinyallerin hepsini gösterir ve liste þeklinde deðer döndürür.
	public void showSelectedSignals() {
		int i = 1;
		System.out.println();
		System.out.println("		The current selected signals by customer");
		for (Signal signal : selecetedSignalList) {
			System.out.println();
			System.out.println(i + ". selected signal");
			System.out.println("CanId : " + signal.getCanId());
			System.out.println("SignalId : " + signal.getSignalId());
			System.out.println("SignalLenght : " + signal.getSignalLenght());
			System.out.println("Factor : " + signal.getFactor());
			System.out.println("Offset : " + signal.getOffset());
			i++;
		}

	}

	public static  ArrayList<Signal> getSelecetedSignalList() {
		return selecetedSignalList;
	}

	public void setSelecetedSignalList(ArrayList<Signal> selecetedSignalList) {
		SignalSelection.selecetedSignalList = selecetedSignalList;
	}

	  
	  
	/*
	 * public void setSelecetedSignalList(ArrayList<Signal> selecetedSignalList) {
	 * this.selecetedSignalList = selecetedSignalList; }
	 */
	 

	
 
}
