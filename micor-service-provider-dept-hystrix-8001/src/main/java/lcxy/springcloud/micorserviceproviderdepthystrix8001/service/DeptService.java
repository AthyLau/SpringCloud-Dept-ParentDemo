package lcxy.springcloud.micorserviceproviderdepthystrix8001.service;

import lcxy.springcloud.micorserviceentity.domain.dto.DeptDTO;
import lcxy.springcloud.micorserviceentity.domain.po.DeptPO;
import lcxy.springcloud.micorserviceproviderdepthystrix8001.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/1/2 下午6:07
 * @since JDK 1.8
 */

@Service
public class DeptService {

    @Autowired
    private DeptMapper deptMapper;


    public Boolean addDept(DeptDTO deptDTO){
        return deptMapper.addDept(deptDTO);
    }

    public List<DeptPO> findAll(){
        return deptMapper.findAll();
    }

    public Boolean delById(Integer id){
        return deptMapper.delById(id);
    }


}
