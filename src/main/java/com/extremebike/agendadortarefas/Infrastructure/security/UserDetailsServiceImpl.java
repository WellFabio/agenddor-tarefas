package com.extremebike.agendadortarefas.Infrastructure.security;


import com.ExtremeBIke.usuario.infrastructure.entity.Usuario;
import com.ExtremeBIke.usuario.infrastructure.repository.UsuarioRepository;
import com.extremebike.agendadortarefas.Infrastructure.client.UsuarioClient;
import com.extremebike.agendadortarefas.business.dto.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl {

    @Autowired
    private UsuarioClient client;

    public UserDetails carregaDadosUsuario(String email, String token){

        UsuarioDTO usuarioDTO = client.buscaUsuarioPorEmail(email, token);
        return User
                .withUsername(usuarioDTO.getEmail()) // Define o nome de usuário como o e-mail
                .password(usuarioDTO.getSenha()) // Define a senha do usuário
                .build();
    }
}
