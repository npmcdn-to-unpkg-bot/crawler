package cn.cnic.datapub.n.serviceimpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.cnic.datapub.n.dao.StatLabelDao;
import cn.cnic.datapub.n.service.IStatLabelService;

@Service("statLabelServiceImpl")
public class StatLabelServiceImpl implements IStatLabelService
{
	@Resource
	StatLabelDao statLabelDao;
}
