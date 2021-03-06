package cn.itcast.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.springboot.pojo.Notice;
import cn.itcast.springboot.service.NoticeService;

@Controller
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	/**
	 * 查询全部公告
	 */
	@GetMapping("/findAll")
	@ResponseBody
	public List<Notice> findAll() {
		return noticeService.findAll();
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/findByPage")
	@ResponseBody
	public Map<String, Object> findByPage(@RequestParam("page")Integer page,
			@RequestParam("rows")Integer rows) {
		return noticeService.findByPage(page, rows);
	}
	
	
}




