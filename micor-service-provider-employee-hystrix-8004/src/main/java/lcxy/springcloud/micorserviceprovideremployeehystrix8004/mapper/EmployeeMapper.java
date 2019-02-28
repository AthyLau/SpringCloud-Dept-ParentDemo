package lcxy.springcloud.micorserviceprovideremployeehystrix8004.mapper;

import lcxy.springcloud.micorserviceentity.domain.po.EmployeePO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    @Select("Select id,employee_id,employee_name,data_source_name from employee")
    List<EmployeePO> findAll();
}
