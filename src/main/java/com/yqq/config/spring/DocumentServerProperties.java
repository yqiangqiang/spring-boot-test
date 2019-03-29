package com.yqq.config.spring;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * properties文件直接映射成java实体类
 */

//@Getter
//@Setter
//@PropertySource("classpath:doc.properties")
////@ConfigurationProperties(prefix = "foo") //springboot注解
//@Component
public class DocumentServerProperties {

    private boolean enabled;

    private InetAddress remoteAddress;

    private Security security;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public InetAddress getRemoteAddress() {
        return remoteAddress;
    }

    public void setRemoteAddress(InetAddress remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public static class Security {

        private String username;

        private String password;

        private List<String> roles = new ArrayList<>(Collections.singleton("USER"));

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public List<String> getRoles() {
            return roles;
        }

        public void setRoles(List<String> roles) {
            this.roles = roles;
        }

        @Override
        public String toString() {
            return "{ " + "username='" + username + '\'' + ", password='" + password + '\'' + " }";
        }
    }

    @Override
    public String toString() {
        return "{ " + "enabled=" + enabled + ", remoteAddress=" + remoteAddress + ", security="
                + security + " }";
    }

}
