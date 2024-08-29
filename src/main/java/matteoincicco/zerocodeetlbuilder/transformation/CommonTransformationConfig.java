package matteoincicco.zerocodeetlbuilder.transformation;

import matteoincicco.zerocodeetlbuilder.config.TransformationConfig;

class CommonTransformationConfig extends TransformationConfig {
  private final String param;

  public CommonTransformationConfig(String param) {
    this.param = param;
  }

  public String getParam() {
    return param;
  }
}
