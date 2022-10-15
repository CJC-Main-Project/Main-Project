package com.cjc.homeloanmanagement.app.repositoryI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.homeloanmanagement.app.model.EmailSender;

@Repository
public interface EmailSenderRepositoryI extends JpaRepository<EmailSender, Integer> {

}
