package matteoincicco.zerocodeetlbuilder.config;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public final class EngineConfigReader {
  private Map<String, Objects> etlConfig;
  private String awsKey;
  private String awsSecret;

  public EngineConfigReader(
      Map<String, Objects> etlConfig, Optional<String> awsKey, Optional<String> awsSecret) {
    this.etlConfig = etlConfig;
    this.awsKey = awsKey.get();
    this.awsSecret = awsSecret.get();
  }

  // public EngineConfig initializeEngineConfig() {
  //    return new CommonEngineConfig(
  //
  //    ) {
  //
  //    }
  // }
}
