package hu.cs.se.adjava.projectmanagement.controller;

import hu.cs.se.adjava.projectmanagement.model.JwtRequest;
import hu.cs.se.adjava.projectmanagement.util.JwtUtility;
import jdk.jfr.Unsigned;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @Autowired
    private JwtUtility jwtUtility;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    @Qualifier("userDetailsServiceImpl")
    private UserDetailsService userDetailsService;

    @PostMapping("/authenticate")
    public String authenticate(@RequestBody JwtRequest jwtRequest) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername()
                    ,jwtRequest.getPassword()));
        }catch (BadCredentialsException e) {
            throw new Exception("Bad Credintials");
        }

        UserDetails userDetails = userDetailsService.loadUserByUsername(jwtRequest.getUsername());

        String jwtToken = jwtUtility.generateToken(userDetails);

        return jwtToken;

    }
}
