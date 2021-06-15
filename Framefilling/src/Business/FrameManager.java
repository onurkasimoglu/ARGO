package Business;

import java.util.ArrayList;

import Entities.Frame;
import Entities.FrameDB;
import Entities.Signal;
import Entities.SignalDB;
import Entities.SignalSelection;

public class FrameManager extends Frame {
	
	//seçilen sinyal listesi ve framelistesi üzerlerinde çalýþýlmak üzere bu classta oluþturulur.
	//https://stackoverflow.com/questions/39989988/access-arraylist-from-another-class
	ArrayList<Signal> signalSelection =SignalSelection.getSelecetedSignalList();
	ArrayList<Frame> framePoolList =FrameDB.getFramePoolList();
	//seçilen sinyal listesi ve framelistesi üzerlerinde çalýþýlmak üzere bu classta oluþturulur.
//*	ArrayList<Frame> framePoolList = FrameDB.getFramePoolList();
//	FrameDB frameDB;
	
//	ArrayList<Frame> FrameList = frameDB.framePool();
//	List<Signal> signalPoolList = signalDB.getList();
//	currentFrame / CurrentFrame++
//	// sinyal lengthi, remaining lenthten büyükse, frame++ sýradaki frame geçecek.
//		
	
	public FrameManager() {
	}
	
	
			
	//Doðan: signaldb çaðrýlýnca load otomatik gelecek, manuel olarak hazýrlanan havuz sinyalleri gelecek.
	
	public void addSignaltoFrame() {
		
																			//		int k=0;
		int j=1;
		int l=0;
		for(int i=0; i<signalSelection.size(); i++) {
			System.out.println();
																			//			k= signalSelection.get(i).getSignalLenght()+k;		

			System.out.println((i+1)+". sinyal büyüklüðü: " + signalSelection.get(i).getSignalLenght());
			//sinyallerin toplam boyutu
				l=l+signalSelection.get(i).getSignalLenght();	
		
				int c;
				c= (framePoolList.get(j).getFrameLength()-l);
	
				if ( c > 0) 
				{
					System.out.println(j+ ". frame kalan uzunluk: " + c);	
					System.out.println((i+1) + ". signal " + j + ". frame yerleþtirildi" );
					System.out.println("ilgili frame için toplam sinyal boyutu : " + l);
				}
				
				else  {
					System.out.println((i+1) + ". signal " + (j+1) + ". frame yerleþtirildi çünkü bir önceki frame'de yer kalmadý" );
					l=0;
					l=l+signalSelection.get(i).getSignalLenght();
					c= (framePoolList.get(j).getFrameLength()-l);
					System.out.println((j+1)+ ". frame kalan uzunluk: " + c);	
					j=j+1;
				}	
				//sinyallerin toplam boyutu, frame büyüklüðünü geçerse, toplam boyut 0'lansýn.
//				if(l>64) {
//					System.out.println("ilgili framede yer kalmadý");
//					l=0;
//				}	
				System.out.println();
				System.out.println();
		}
		
		
		}

	//kullanýcýnýn hangi signalleri seçtiði
	public void StartFillTheFrame() {
	}
	
	public void GenerateFrames() {
		
	}


	
	

}
