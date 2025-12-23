package me.shinsunyoung.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Table(name="users")
@NoArgsConstructor
@Getter
@Entity
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", updatable = false)
    private Long id;

    @Column(name="email", nullable = false, unique = true)
    private String email; // 로그인시 사용하는 ID

    @Column(name="password")
    private String password; // 비밀번호

    @Column(name="auth")
    private String auth; // 권한

    @Builder
    public User(String email, String password, String auth){
        this.email = email;
        this.password = password;
        this.auth = auth;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(auth.equals("admin")){
            // ROLE_ADMIN : 관리자 권한
            // ROLE_USER : 일반 사용자 권한
            // ROLE_ : SpringSecurity에서 권한 설정시 붙이는 규칙
            return List.of(new SimpleGrantedAuthority("ROLE_ADMIN"),
                    new SimpleGrantedAuthority("ROLE_USER"));
        }
        // 유저가 가진 권환을 반환하는 메서드
        return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }
    @Override
    public String getUsername() {
        return email; // 실제 로그인에 사용되는 아이디 설정
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isAccountNonExpired() {
        // 계정 만료 여부 반환
        return true; // 만료되지 않으면 true
    }

    @Override
    public boolean isAccountNonLocked() {
        // 계정 잠금 여부 반환
        return true; // 잠겨있지 않으면 true
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // 패스워드 만료 여부 반환
        return true;
    }

    @Override
    public boolean isEnabled() {
        // 계정 사용 가능 여부 반환
        return true;
    }
}
