package matteoincicco.zerocodeetlbuilder.transformation;

import org.apache.spark.sql.Dataset;
import matteoincicco.zerocodeetlbuilder.config.TransformationConfig;
import org.apache.spark.sql.Row;

import static matteoincicco.zerocodeetlbuilder.config.Constants.SELECT_EXPRESSION;

// Generic interface for Transformation
public abstract class Transformation<B extends TransformationConfig> {

  // Abstract method for transformation logic
  public abstract Dataset<org.apache.spark.sql.Row> transform(Dataset<Row> df, B config);

  // Method to get a specific transformation by name
  public static Transformation<? extends TransformationConfig> get_transformation(
      String transformationName) {
    switch (transformationName) {
      case SELECT_EXPRESSION:
        return new SelectExpressionTransformation();
      default:
        throw new RuntimeException("Unknown transformation name: " + transformationName);
    }
  }
}
