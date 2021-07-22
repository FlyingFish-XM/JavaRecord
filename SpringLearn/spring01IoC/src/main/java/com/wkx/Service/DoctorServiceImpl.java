package com.wkx.Service;


import com.wkx.dao.DoctorDao;
import com.wkx.dao.DoctorDaoImpl;

/**
 * @author kaixuan.wang
 * @date 2021年07月20日 16:02
 */
public class DoctorServiceImpl implements DoctorService {

    private DoctorDao doctorDao;

    public void setDoctorDao(DoctorDao doctorDao) {
        this.doctorDao = doctorDao;
    }

    @Override
    public void eat() {
        doctorDao.eat();
    }
}
