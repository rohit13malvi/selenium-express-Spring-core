package com.napier.it.DependencyInjectionObjectType;

public class AnotherStudent {
	
	private MathCheat cheat;

	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}

	public void chating() {
		cheat.mathCheathing();
	}

}
