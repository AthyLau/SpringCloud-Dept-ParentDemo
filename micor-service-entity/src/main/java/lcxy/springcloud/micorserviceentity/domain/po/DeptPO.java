package lcxy.springcloud.micorserviceentity.domain.po;

/**
 * Function:
 *
 * @author liubing
 * Date: 2018/12/28 下午8:18
 * @since JDK 1.8
 */


public class DeptPO {
    /**
     * id
     */
    private Integer id;
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 所在的数据库
     */
    private String dataSourceName;

    public DeptPO() {
    }

    public DeptPO(Integer id, String deptName, String dataSourceName) {
        this.id = id;
        this.deptName = deptName;
        this.dataSourceName = dataSourceName;
    }

    @Override
    public String toString() {
        return "DeptPO{" +
                "id=" + id +
                ", deptName='" + deptName + '\'' +
                ", dataSourceName='" + dataSourceName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
