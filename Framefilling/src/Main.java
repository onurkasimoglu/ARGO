import java.util.ArrayList;

import Business.FrameManager;
import Entities.Frame;
import Entities.FrameDB;
import Entities.Signal;
import Entities.SignalDB;
import Entities.SignalSelection;
public class Main {

	public static void main(String[] args) {
		
		


////		  FrameDB frameDB = new FrameDB();
		
		SignalDB signalDB = new SignalDB();
//		signalDB.showDataBase();
		 SignalSelection signalSelection = new SignalSelection();
		  signalSelection.addSignal(1); 
		  signalSelection.addSignal(4); 
		  signalSelection.addSignal(1); 
		  signalSelection.addSignal(5); 
		  signalSelection.deleteSignal(1);
		  signalSelection.addSignal(1); 
		  signalSelection.addSignal(4); 
		  signalSelection.addSignal(1); 
		  signalSelection.addSignal(1); 
		  signalSelection.addSignal(2); 
//		  signalSelection.addSignal(1); 
//		  signalSelection.addSignal(1); 
		  FrameDB frameDB = new FrameDB();
		  frameDB.framePool();
		  FrameManager frameManager = new FrameManager(); 
		  frameManager.addSignaltoFrame();

		  
	
	
	
	}

}
