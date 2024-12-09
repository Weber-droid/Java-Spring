package data.jpa.spring.dto;

// import lombok.AllArgsConstructor;
// import lombok.Data;
import lombok.Getter;
// import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
// @Data
// @AllArgsConstructor
// @NoArgsConstructor
public class UserDTO {
    private Long id;

    private String name;

    private String email;

}
