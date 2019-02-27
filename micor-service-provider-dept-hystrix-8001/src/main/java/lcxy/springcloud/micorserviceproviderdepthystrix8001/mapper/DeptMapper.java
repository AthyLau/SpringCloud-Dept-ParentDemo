package lcxy.springcloud.micorserviceproviderdepthystrix8001.mapper;

import lcxy.springcloud.micorserviceentity.domain.dto.DeptDTO;
import lcxy.springcloud.micorserviceentity.domain.po.DeptPO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface DeptMapper {

    @Insert("INSERT INTO dept(dept_name, data_source_name) VALUES (#{deptName},database())")
    Boolean addDept(DeptDTO deptDTO);

    @Select("select id,dept_name,data_source_name from dept")
    List<DeptPO> findAll();

    @Delete("delete from dept where id = #{id}")
    Boolean delById(Integer id);

}
