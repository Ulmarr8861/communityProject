package life.ulmarr8861.communityproject.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Created by Ulmarr8861 on 2021/12/24 10:50
 */
@Component
@Data
public class AccessTokenDto {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_url;
    private String state;
}
