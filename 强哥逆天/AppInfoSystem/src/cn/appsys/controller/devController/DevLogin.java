package cn.appsys.controller.devController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.appsys.pojo.DevUser;
import cn.appsys.service.devUser.DevUserService;
import cn.appsys.tools.Constants;

@Controller
@RequestMapping
public class DevLogin {

	@Resource
	private DevUserService devUserService;
	public DevUserService getDevUserService() {
		return devUserService;
	}
	public void setDevUserService(DevUserService devUserService) {
		this.devUserService = devUserService;
	}
	@RequestMapping(value="/devLogin")
	public String intoDevLogin() {
		System.out.println(1);
		return "devLogin";
	}
	@RequestMapping(value="/isDevLogin")//��¼��֤
	public String isDevLogin(String devCode,String devPassword,HttpSession session,HttpServletRequest request) {
		System.out.println(devCode+" "+devPassword);
		DevUser devUser = devUserService.login(devCode,devPassword);
		if (devUser != null) {
			session.setAttribute(Constants.DEV_USER_SESSION, devUser);
			return "developer/devWelcome";//�ɹ�
		}else {
			request.setAttribute("error","�û��������벻��ȷ");
			return "devLogin";//ʧ��
		}
	}
}
