package io.javabrains;

import java.io.File;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "datastax.astra")
@Data
public class DataStaxAstraProperties {

  private File secureConnectBundle;

}
