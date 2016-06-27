package com.cog.repo;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cog.entity.Member;

@Repository
public class MemberRepository {

	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public void addMember(Member member) throws Exception{
		em.persist(member);
	}
}