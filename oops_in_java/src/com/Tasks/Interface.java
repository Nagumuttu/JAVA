package com.Tasks;

interface Playable {
	void play();

}

class Guitar implements Playable {
	@Override
	public void play() {
		System.out.println("Playing Guitar");
	}
}

class Piano implements Playable {
	public void play() {
		System.out.println("Playing piano");

	}
}

class Drum implements Playable {
	public void play() {
		System.out.println("Playing Drum");
	}
}

public class Interface {
	public static void main(String[] args) {
		Playable g = new Guitar();
		Playable p = new Piano();
		Playable d = new Drum();
		g.play();
		p.play();
		d.play();

	}
}
