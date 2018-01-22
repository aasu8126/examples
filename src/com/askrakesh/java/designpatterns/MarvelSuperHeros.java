package com.askrakesh.java.designpatterns;

import java.util.List;

class MarvelSuperHeros implements SuperHeros {
	List<String> characters = List.of("Spider Man", "Captain America", "Daredevil", "Wolverine", "Iron Man");

	@Override
	public List<String> getCharacters() {
		return characters;
	}
}
