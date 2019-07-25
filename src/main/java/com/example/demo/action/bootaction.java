package com.example.demo.action;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.biz.bootbiz;
import com.example.demo.dao.IPersonDao;
import com.example.demo.pojo.boot;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/sky") // 命名空间
public class bootaction {

	@Autowired
	private bootbiz biz;
	
	@GetMapping("/findall/{p}/{s}")
	public PageInfo<boot> findall(@PathVariable Integer p, @PathVariable Integer s) {
		return biz.findall(p, s);
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable Integer id) {
		System.err.println(id);
		return biz.delete(id);
	}
}
