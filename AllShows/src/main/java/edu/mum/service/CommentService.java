package edu.mum.service;

import java.util.List;

import edu.mum.domain.Comment;

public interface CommentService {
	
	void save(Comment comment);
	List<Comment> getAll();

}
