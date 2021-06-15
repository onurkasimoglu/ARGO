package Entities;

import java.util.ArrayList;
import java.util.List;

import Business.FrameManager;


public class FrameDB {
	
	private static ArrayList<Frame> framePoolList = new ArrayList<Frame>();
	
	public FrameDB() {
		}

	
	// dataBase load signals
	public void framePool() { 
		for(int i = 1; i < 20; i++) {
			framePoolList.add(new Frame(i));}
		
		/*
		 * int j=1; for (Frame frame : framePoolList ) { System.out.println("CanId : " +
		 * frame.getFrameId()); System.out.println("FrameLength : " +
		 * frame.getFrameLength()); System.out.println("remainingLength : " +
		 * frame.getRemainingLength()); j++; }
		 */

 }


	public static ArrayList<Frame> getFramePoolList() {
		return framePoolList;
	}


	public void setFramePoolList(ArrayList<Frame> framePoolList) {
		FrameDB.framePoolList = framePoolList;
	}
}



