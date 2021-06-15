package Business;

import java.util.ArrayList;

import Entities.Frame;
import Entities.FrameDB;
import Entities.Signal;
import Entities.SignalDB;
import Entities.SignalSelection;

public class FrameManager extends Frame {
	
	//se�ilen sinyal listesi ve framelistesi �zerlerinde �al���lmak �zere bu classta olu�turulur.
	//https://stackoverflow.com/questions/39989988/access-arraylist-from-another-class
	ArrayList<Signal> signalSelection =SignalSelection.getSelecetedSignalList();
	ArrayList<Frame> framePoolList =FrameDB.getFramePoolList();
	//se�ilen sinyal listesi ve framelistesi �zerlerinde �al���lmak �zere bu classta olu�turulur.
//*	ArrayList<Frame> framePoolList = FrameDB.getFramePoolList();
//	FrameDB frameDB;
	
//	ArrayList<Frame> FrameList = frameDB.framePool();
//	List<Signal> signalPoolList = signalDB.getList();
//	currentFrame / CurrentFrame++
//	// sinyal lengthi, remaining lenthten b�y�kse, frame++ s�radaki frame ge�ecek.
//		
	
	public FrameManager() {
	}
	
	
			
	//Do�an: signaldb �a�r�l�nca load otomatik gelecek, manuel olarak haz�rlanan havuz sinyalleri gelecek.
	
	public void addSignaltoFrame() {
		
																			//		int k=0;
		int j=1;
		int l=0;
		for(int i=0; i<signalSelection.size(); i++) {
			System.out.println();
																			//			k= signalSelection.get(i).getSignalLenght()+k;		

			System.out.println((i+1)+". sinyal b�y�kl���: " + signalSelection.get(i).getSignalLenght());
			//sinyallerin toplam boyutu
				l=l+signalSelection.get(i).getSignalLenght();	
		
				int c;
				c= (framePoolList.get(j).getFrameLength()-l);
	
				if ( c > 0) 
				{
					System.out.println(j+ ". frame kalan uzunluk: " + c);	
					System.out.println((i+1) + ". signal " + j + ". frame yerle�tirildi" );
					System.out.println("ilgili frame i�in toplam sinyal boyutu : " + l);
				}
				
				else  {
					System.out.println((i+1) + ". signal " + (j+1) + ". frame yerle�tirildi ��nk� bir �nceki frame'de yer kalmad�" );
					l=0;
					l=l+signalSelection.get(i).getSignalLenght();
					c= (framePoolList.get(j).getFrameLength()-l);
					System.out.println((j+1)+ ". frame kalan uzunluk: " + c);	
					j=j+1;
				}	
				//sinyallerin toplam boyutu, frame b�y�kl���n� ge�erse, toplam boyut 0'lans�n.
//				if(l>64) {
//					System.out.println("ilgili framede yer kalmad�");
//					l=0;
//				}	
				System.out.println();
				System.out.println();
		}
		
		
		}

	//kullan�c�n�n hangi signalleri se�ti�i
	public void StartFillTheFrame() {
	}
	
	public void GenerateFrames() {
		
	}


	
	

}
