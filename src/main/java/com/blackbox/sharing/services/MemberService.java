/**
 * 
 */
package com.blackbox.sharing.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blackbox.sharing.domain.Member;
import com.blackbox.sharing.repositories.MemberRepository;
import com.blackbox.sharing.services.exceptions.ObjectNotFoundException;

/**
 * @author joseph
 *
 */
@Service
public class MemberService {
	@Autowired
	private MemberRepository reposit;
	public Member find(Integer id) {
		Member member = reposit.findOne(id);
		if (member == null) {
			throw new ObjectNotFoundException("Object Not Found! Id: " + id
					+ ", Type: " + Member.class.getName());
		}

		return member;
	}
}