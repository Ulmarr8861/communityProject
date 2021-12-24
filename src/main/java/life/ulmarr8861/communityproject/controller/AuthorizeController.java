package life.ulmarr8861.communityproject.controller;

import life.ulmarr8861.communityproject.dto.AccessTokenDto;
import life.ulmarr8861.communityproject.provider.GithubProvider;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorizeController {
    @Autowired
    private GithubProvider githubProvider;

    @GetMapping("/callback")
    public String callBack(@RequestParam(name = "code") String code,
                           @RequestParam(name = "state") String state) {
        AccessTokenDto accessTokenDto = new AccessTokenDto();
        accessTokenDto.setClient_id("73b3e5f35e53bf119c1a");
        accessTokenDto.setClient_secret("f3b26d0182e875e96f4a521c5392632bbd82cdbf");
        accessTokenDto.setCode(code);
        accessTokenDto.setState(state);
        accessTokenDto.setRedirect_url("http://localhost:8887/callback");
        githubProvider.getAccessToken(accessTokenDto);
        return "index";
    }
}
