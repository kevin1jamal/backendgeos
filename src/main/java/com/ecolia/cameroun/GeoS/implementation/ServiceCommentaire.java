package com.ecolia.cameroun.GeoS.implementation;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecolia.cameroun.GeoS.entity.Commentaires;
import com.ecolia.cameroun.GeoS.repository.CommentaireRepository;
import com.ecolia.cameroun.GeoS.service.IServiceCommentaire;

public class ServiceCommentaire implements IServiceCommentaire{

	@Autowired
	CommentaireRepository commrep;
	@Override
	public void faireCommentaire(Commentaires comm) {
		// TODO Auto-generated method stub
		commrep.save(comm);
		
	}

}
