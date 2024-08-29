package matteoincicco.zerocodeetlbuilder.transformation;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.functions;

// Implementation of a specific transformation
public class SelectExpressionTransformation extends Transformation<CommonTransformationConfig> {

  @Override
  public Dataset<Row> transform(Dataset<Row> df, CommonTransformationConfig config) {
    return df.withColumn("select_expr", functions.lit(config.getParam()));
  }
}
