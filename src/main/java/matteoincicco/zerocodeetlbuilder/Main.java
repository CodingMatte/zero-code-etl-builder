package matteoincicco.zerocodeetlbuilder;

import matteoincicco.zerocodeetlbuilder.config.Constants;
import org.yaml.snakeyaml.Yaml;
import java.io.InputStream;
import java.util.Map;
import java.util.Objects;

public class Main {

  private static Map<String, Objects> importEtlConfig(String pathToEtlConfig) {

    // Load the YAML file
    InputStream inputStream = Main.class.getClassLoader().getResourceAsStream(pathToEtlConfig);

    // Parse the YAML file into a Map
    Yaml yaml = new Yaml();
    Map<String, Objects> yamlImported = yaml.load(inputStream);

    // Print the content of the YAML file
    System.out.println(yamlImported);
    return yamlImported;
  }

  public static void main(String[] args) {

    Map<String, Objects> configContent = importEtlConfig("etl_config_1.yaml");

    Map<T, T> aa = configContent.get(Constants.ETL_CONFIG);
    System.out.println(configContent.get(Constants.ETL_CONFIG);
  }
}
