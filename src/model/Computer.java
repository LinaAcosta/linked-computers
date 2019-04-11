package model;

public class Computer {
	private int hd;
	private int ram;
	private String ip;
	private Computer previous;
	private Computer next;
	public Computer(int h, int r, String i) {
		hd = h;
		ram = r;
		ip = i;
	}
	public int getHD() {
		return hd;
	}
	public int getRam() {
		return ram;
	}
	public String getIP() {
		return ip;
	}
	public Computer getPrevious() {
		return previous;
	}
	public Computer getNext() {
		return next;
	}
	public void setPrevious(Computer c) {
		previous = c;
	}
	public void setNext(Computer c) {
		next = c;
	}
	
	

}
