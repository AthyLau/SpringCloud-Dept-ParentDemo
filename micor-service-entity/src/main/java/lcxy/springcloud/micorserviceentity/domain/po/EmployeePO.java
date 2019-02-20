package lcxy.springcloud.micorserviceentity.domain.po;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/2/20 上午11:38
 * @since JDK 1.8
 */


public class EmployeePO {
    private Integer id;
    private String employeeId;
    private String employeeName;
    private String dataSourceName;
    public EmployeePO() {
    }

    public EmployeePO(Integer id, String employeeId, String employeeName, String dataSourceName) {
        this.id = id;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.dataSourceName = dataSourceName;
    }

    @Override
    public String toString() {
        return "EmployeePO{" +
                "id=" + id +
                ", employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", dataSourceName='" + dataSourceName + '\'' +
                '}';
    }

    public String getDataSourceName() {
        return dataSourceName;
    }

    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
