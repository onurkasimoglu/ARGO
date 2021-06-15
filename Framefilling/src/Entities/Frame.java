package Entities;

import java.util.ArrayList;
import java.util.List;

public class Frame {
	
	private int FrameId;
	private int FrameLength=64;
	private int remainingLength=64;
	ArrayList<Signal> selecetedSignalListForthisFrame; // Frame için seçilen sinya
	
	public Frame() {
	}
	
	public Frame(int frameId) {
		super();
		FrameId = frameId;
	}
	public int getFrameId() {
		return FrameId;
	}
	public void setFrameId(int frameId) {
		FrameId = frameId;
	}
	public int getFrameLength() {
		return FrameLength;
	}
	public void setFrameLength(int frameLength) {
		FrameLength = frameLength;
	}

	public int getRemainingLength() {
		return remainingLength;
	}

	public void setRemainingLength(int remainingLength) {
		this.remainingLength = remainingLength;
	}

}
