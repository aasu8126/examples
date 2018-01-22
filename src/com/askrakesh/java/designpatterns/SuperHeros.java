package com.askrakesh.java.designpatterns;

import java.util.List;;

public interface SuperHeros {
	public List<String> getCharacters();

	static SuperHeros createDCSuperHeros() {
		return new DCSuperHeros();
	}

	static SuperHeros createMarvelSuperHeros() {
		return new MarvelSuperHeros();
	}
}
