package com.niimto.automation.configuration;

//@Configuration
//@EnableWebSecurity
////@EnableGlobalMethodSecurity(prePostEnabled = true)
//@PreAuthorize("hasAuthority('user:read')")
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http
//        .csrf().disable()
//                .authorizeRequests()
//                .antMatchers( "/").permitAll()
//                .antMatchers( "/view/**").permitAll()
//                .antMatchers( "/templates/create").permitAll()
//                .antMatchers( "/people").permitAll()
//                .antMatchers( "/people/new").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login").permitAll()
//                .defaultSuccessUrl("/cabinet", true)
//                .loginProcessingUrl("perform_login")
//                .and()
//                .logout()
//                .logoutRequestMatcher(new AntPathRequestMatcher("/logout", "POST"))
//                .invalidateHttpSession(true)
//                .clearAuthentication(true)
//                .deleteCookies("JSESSIONID")
//                .logoutSuccessUrl("/login");
//
//    }
//
//    @Bean
//    public InMemoryUserDetailsManager userDetailsService(){
//        UserDetails admin = User.withUsername("admin")
//                .password(passwordEncoder().encode("admin"))
//                .roles("ADMIN")
//                .authorities(UserRole.ADMIN.getAuthorities())
//                .build();
//        return new InMemoryUserDetailsManager(admin);
//    }

////    @Bean
//    public DefaultSecurityFilterChain filterChain() throws Exception {
//        getHttp()
//                .csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/admin/**").hasRole("ADMIN")
//                .antMatchers("/anonymous*")
//                .anonymous()
//                .antMatchers("/login*")
//                .permitAll()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/templates/login.html")
//                .loginProcessingUrl("/login")
//                .defaultSuccessUrl("/templates/index.html", true)
//                .failureUrl("/templates/login.html?error=true")
//                .and()
//                .logout()
//                .invalidateHttpSession(true)
//                .clearAuthentication(true)
//                .deleteCookies("JSESSIONID")
//                .logoutSuccessUrl("/templates/login");
//        return getHttp().build();
//    }

//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//}
