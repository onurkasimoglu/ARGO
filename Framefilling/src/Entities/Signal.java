package Entities;

public class Signal {

// fields
	private int canId;
	private int signalId;
	private int signalLenght;
	private double factor;
	private double offset;
	
// constructor with parameters
	public Signal(int canId, int signalId, int signalLenght, double factor, double offset) {
		super();
		this.canId = canId;
		this.signalId = signalId;
		this.signalLenght = signalLenght;
		this.factor = factor;
		this.offset = offset;
	}
// Setters & Getters
	public int getCanId() {
		return canId;
	}

	public void setCanId(int canId) {
		this.canId = canId;
	}

	public int getSignalId() {
		return signalId;
	}

	public void setSignalId(int signalId) {
		this.signalId = signalId;
	}

	public int getSignalLenght() {
		return signalLenght;
	}

	public void setSignalLenght(int signalLenght) {
		this.signalLenght = signalLenght;
	}

	public double getFactor() {
		return factor;
	}

	public void setFactor(double factor) {
		this.factor = factor;
	}

	public double getOffset() {
		return offset;
	}

	public void setOffset(double offset) {
		this.offset = offset;
	}

	
	
}
