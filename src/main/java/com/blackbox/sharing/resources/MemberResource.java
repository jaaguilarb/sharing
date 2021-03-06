package com.blackbox.sharing.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blackbox.sharing.domain.Member;
import com.blackbox.sharing.services.MemberService;

@RestController
@RequestMapping(value = "/member")
public class MemberResource {
	@Autowired
	private MemberService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Member member = service.find(id);

		return ResponseEntity.ok().body(member);
	}
}
