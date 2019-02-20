package lcxy.springcloud.micorserviceprovideremployee8006.micorserviceprovideremployee8006.service;

import lcxy.springcloud.micorserviceentity.domain.po.EmployeePO;
import lcxy.springcloud.micorserviceprovideremployee8006.micorserviceprovideremployee8006.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/2/20 上午11:40
 * @since JDK 1.8
 */

@Service
public class EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    public List<EmployeePO> findAll() {
        return employeeMapper.findAll();
    }
}
