package com.askrakesh.java.designpatterns;

import java.util.List;

class DCSuperHeros implements SuperHeros {
	List<String> characters = List.of("Super Man", "Bat Man", "Wonder Woman", "Cyborg", "Flash");

	@Override
	public List<String> getCharacters() {
		return characters;
	}
}
