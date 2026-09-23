package ra.edu.ss13homework.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    // Endpoint test: POST /api/v1/auth/login (public - không cần xác thực)
    @PostMapping("/login")
    public String login() {
        return "Đăng nhập thành công";
    }
}
