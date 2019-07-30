//package com.ddastudio.fishing.bank;
//
//        import com.ddastudio.fishing.common.AppProperties;
//        import com.ddastudio.fishing.common.BaseControllerTest;
//        import com.ddastudio.fishing.common.util.BeanUtil;
//        import com.ddastudio.fishing.common.util.CommonUtil;
//        import org.junit.Test;
//        import org.springframework.beans.factory.annotation.Autowired;
//        import org.springframework.http.HttpEntity;
//        import org.springframework.http.HttpMethod;
//        import org.springframework.http.ResponseEntity;
//        import org.springframework.security.jwt.Jwt;
//        import org.springframework.security.jwt.JwtHelper;
//        import org.springframework.web.client.RestTemplate;
//
//        import java.util.HashMap;
//        import java.util.Map;
//
//public class BankRestAPITest extends BaseControllerTest {
//
//    @Autowired
//    AppProperties properties;
//
//    @Test
//    public void getAuth() {
//        String a = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX25hbWUiOiIwMTA5OTg5MTkxMyIsInNjb3BlIjpbInJlYWQiLCJ3cml0ZSJdLCJUT0tFTl9DUkVBVEVEX1RJTUUiOiIyMDE5MDczMCIsImV4cCI6MTU2NzA4ODc0MywiYXV0aG9yaXRpZXMiOlsiUk9MRV9VU0VSIl0sImp0aSI6ImV5SmhiR2NpT2lKU1V6STFOaUlzSW5SNWNDSTZJa3BYVkNKOS5leUpVVDB0RlRsOURVa1ZCVkVWRVgxUkpUVVVpT2lJeU1ERTVNRGN6TUNJc0ltVjRjQ0k2TVRVMk56QTRPRGMwTXl3aWRYTmxjbDl1WVcxbElqb2lNREV3T1RrNE9URTVNVE1pTENKaGRYUm9iM0pwZEdsbGN5STZXeUpTVDB4RlgxVlRSVklpWFN3aVkyeHBaVzUwWDJsa0lqb2labWx6YUdsdVp5SXNJbk5qYjNCbElqcGJJbkpsWVdRaUxDSjNjbWwwWlNKZGZRLlAyek5qRTZSWDlRSElsb2tUWW1icGdzVHJwbzdHMURpWjhyX2k1STdablU3VWtjNjJJWC13bWJaV250YzhGVG15U25KdDgwUDRCOTVFMUYtdUpFN3RyNThESXhSWUt6cXJtSURQcGk0ZWUyYzhWVk5JRjF4WW1NLVFzNHllYTZFbDNKUWFseV9CTTlyWXQ5bFFhZXFUanFNNVd0U0xjbWphWUVBdVlSbjlvU1ItRmNYSjdHMmplVEVCYUhWTjFnSFBCR051V3RxYVVZSTFHQ1l6YkZWbW93aHVkNHh3VjkzWlN4VHZUajBUekZKamx6MHdwS3Y1ODFhWkNQQktpRi1hU0dObGVkSmpxZ3lVMktxejhLUVM4bHFKMlg2d1c3RzdROXMwX05VdmtUV1ZUNTJ1dldFQzYxRFhiazFuUXpfUkFLaUFiSFVQczFsOEtraVFnVWY1dyIsImNsaWVudF9pZCI6ImZpc2hpbmcifQ.Qi5FKXKwg5U-vYcoYCLVniKY0mHKxja3x6XjGerj35CJvSSKooRi4TItOleQwdrDmXMKp0VBee3joLtdtZzT_W1xTQkvagE90RrNw6bgAx3S8X3t-gC0IeKmjX6mnHmyG2zO7hJPSIwh-FtGNuvrn8QXOs3FpudgabKxSaXbMPTZNjnja1VmN7nXkvhkQ88EeDIOFDPqHWQJj8hSqXsIdcchpN_VQjPulaxgdz-zrlDflFx0C__AQ3xKYEwvKh01UtceZEzk4-mHhxnuh3iQ_cAXMk92etjBC-uDM9RfAoP1fCoAPegov5u5dTsArQ57Pd9XMEU9y8yYqOKKGnAhfw";
//        Jwt decode = JwtHelper.decode(a);
//        String claims = decode.getClaims();
//        System.out.println(claims);
//
//        //JwtHelper.headers(a).forEach((k,v) -> System.out.println(k+":"+v));
//
//
//    }
//}
