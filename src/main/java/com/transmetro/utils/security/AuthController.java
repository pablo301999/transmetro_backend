package com.transmetro.utils.security;

import com.transmetro.dto.LoginRequest;
import com.transmetro.dto.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.transmetro.models.Usuarios;
import com.transmetro.services.AuthenticationService;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        Authentication authentication = authenticationService.autenticar(
            loginRequest.getCorreo(),
            loginRequest.getContrasenia()
        );

        UsuarioDetails usuarioDetails = (UsuarioDetails) authentication.getPrincipal();
        Usuarios u = usuarioDetails.getUsuarioEntity();
        String token = jwtUtil.generateToken(u.getCorreo());

        return ResponseEntity.ok(new LoginResponse(token, u.getNombreCompleto(), u.getRol()));
    }
}
