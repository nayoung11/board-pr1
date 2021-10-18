package com.example.demo.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Board5;
import com.example.demo.service.Board5Service;

@Controller
public class Board5Controller {

	@Autowired
	private Board5Service board5service;

	/**
	 * 메인 화면
	 * @author l2jong
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		List<Board5> board5List = board5service.selectAll();
		model.addAttribute("board5List", board5List);
		return "index";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert() {
		return "insert";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insertPost(@ModelAttribute Board5 paramVO) {

		int result = board5service.insert(paramVO);

		return "redirect:/";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(@RequestParam("no") int no, Model model) {
		
		Board5 board5 = board5service.selectDetail(no);
		
		model.addAttribute("board5", board5);
		return "/update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updatePost(@ModelAttribute Board5 paramVO) {
		
		int result = board5service.update(paramVO);
		
		return "redirect:/";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(@RequestParam("no") int no) {
		
		int result = board5service.delete(no);
		
		return "redirect:/";
	}

}
