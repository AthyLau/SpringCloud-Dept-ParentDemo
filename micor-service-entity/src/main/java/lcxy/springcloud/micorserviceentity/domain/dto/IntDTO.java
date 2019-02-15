package lcxy.springcloud.micorserviceentity.domain.dto;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/1/3 下午5:53
 * @since JDK 1.8
 */


public class IntDTO {
    private Integer id;

    public IntDTO() {
    }

    public IntDTO(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "IntDTO{" +
                "id=" + id +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
