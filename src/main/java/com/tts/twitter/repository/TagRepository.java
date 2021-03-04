package com.tts.twitter.repository;


import org.springframework.data.repository.CrudRepository;

import com.tts.twitter.model.Tag;

public interface TagRepository extends CrudRepository<Tag, Long> {
	public Tag findByPhrase(String phrase);
}