package uz.pdp.springboot_example.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "mailing")
public record MailingProperty(
        String message,
        Integer port,
        String username,
        String password
) {
}
