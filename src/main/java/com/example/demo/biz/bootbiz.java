package com.example.demo.biz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.dao.IPersonDao;
import com.example.demo.pojo.boot;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class bootbiz {
	@Autowired
	private IPersonDao dao;
	
	public PageInfo<boot> findall(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<boot>(dao.findall());
	}
	public int delete(Integer id) {
		return dao.deletebyid(id);
	}
}
