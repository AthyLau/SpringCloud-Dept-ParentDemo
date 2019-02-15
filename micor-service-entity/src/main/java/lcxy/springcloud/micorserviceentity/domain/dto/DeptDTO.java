package lcxy.springcloud.micorserviceentity.domain.dto;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/1/4 下午2:51
 * @since JDK 1.8
 */


public class DeptDTO {
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 所在的数据库
     */
    private String dataSourceName;

    public DeptDTO() {
    }

    public DeptDTO(String deptName, String dataSourceName) {
        this.deptName = deptName;
        this.dataSourceName = dataSourceName;
    }

    @Override
    public String toString() {
        return "DeptDTO{" +
                "deptName='" + deptName + '\'' +
                ", dataSourceName='" + dataSourceName + '\'' +
                '}';
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDataSourceName() {
        return dataSourceName;
    }

    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }
}
