package cn.appsys.service.devUser;

import org.springframework.stereotype.Service;

import cn.appsys.dao.devUser.DevUserMapper;
import cn.appsys.pojo.DevUser;

@Service("devUserService")
public class DevUserServiceImpl implements DevUserService{

	private DevUserMapper devUserMapper;
	public DevUserMapper getDevUserMapper() {
		return devUserMapper;
	}
	public void setDevUserMapper(DevUserMapper devUserMapper) {
		this.devUserMapper = devUserMapper;
	}
	@Override
	public DevUser login(String devCode, String devPassword) {
		DevUser devUser = null;
		try {
			devUser = devUserMapper.getLoginUser(devCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (devUser != null) {
			if (!devUser.getDevPassword().equals(devPassword)) {
				devUser = null;
			}
		}
		return devUser;
	}

}
