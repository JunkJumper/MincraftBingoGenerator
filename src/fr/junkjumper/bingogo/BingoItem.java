package fr.junkjumper.bingogo;

import org.bukkit.Material;

public class BingoItem {
	private Material m;
	private boolean get;
	
	public BingoItem(Material mm) {
		this.m = mm;
		this.get = false;
	}

	public Material getM() {
		return m;
	}

	public boolean isGet() {
		return get;
	}
	
	public void itemPicked() {
		this.get = true;
	}
	
	public void itemUnpicked() {
		this.get = false;
	}
	
	@Override
	public String toString() {
		return this.m.toString();
	}
}
