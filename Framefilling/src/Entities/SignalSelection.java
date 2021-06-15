package Entities;

import java.util.ArrayList;

public class SignalSelection extends SignalDB {
	// g�ncel m��teri istekleri bu listede toplan�r
	private static ArrayList<Signal> selecetedSignalList = new ArrayList<Signal>();

	// parametresiz constructor
	public SignalSelection() {
	}

	// M��teri sinyal ekler
	public void addSignal(int selection) {

		selecetedSignalList.add(signalPoolList.get(selection));
		showSelectedSignals();

	}

	// M��teri sinyal siler
	public void deleteSignal(int selection) {

		selecetedSignalList.remove(selection);
		showSelectedSignals();

	}

	// Se�ilen sinyallerin hepsini g�sterir ve liste �eklinde de�er d�nd�r�r.
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
